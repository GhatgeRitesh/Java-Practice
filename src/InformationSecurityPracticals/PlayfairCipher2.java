package InformationSecurityPracticals;

import java.util.HashSet;

public class PlayfairCipher2 {

    private char[][] matrix = new char[5][5];
    private String keyword;

    public  PlayfairCipher2(String keyword) {
        this.keyword = prepareKeyword(keyword);
        createMatrix();
    }

    private String prepareKeyword(String keyword) {
        keyword = keyword.toUpperCase().replaceAll("[^A-Z]", "").replace('J', 'I');
        StringBuilder sb = new StringBuilder();
        HashSet<Character> used = new HashSet<>();
        for (char c : keyword.toCharArray()) {
            if (!used.contains(c)) {
                used.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private void createMatrix() {
        String alphabet = "ABCDEFGHIKLMNOPQRSTUVWXYZ";
        StringBuilder keyMatrixBuilder = new StringBuilder(keyword);
        for (char c : alphabet.toCharArray()) {
            if (!keyword.contains(String.valueOf(c))) {
                keyMatrixBuilder.append(c);
            }
        }

        int index = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = keyMatrixBuilder.charAt(index++);
            }
        }
    }

    private String prepareText(String text) {
        text = text.toUpperCase().replaceAll("[^A-Z]", "").replace('J', 'I');
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i += 2) {
            sb.append(text.charAt(i));
            if (i + 1 < text.length() && text.charAt(i) == text.charAt(i + 1)) {
                sb.append('X');
            }
            if (i + 1 < text.length()) {
                sb.append(text.charAt(i + 1));
            }
        }
        if (sb.length() % 2 != 0) {
            sb.append('X');
        }
        return sb.toString();
    }

    public String encrypt(String text) {
        text = prepareText(text);
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < text.length(); i += 2) {
            char first = text.charAt(i);
            char second = text.charAt(i + 1);
            int[] firstPos = findPosition(first);
            int[] secondPos = findPosition(second);
            if (firstPos[0] == secondPos[0]) {
                encryptedText.append(matrix[firstPos[0]][(firstPos[1] + 1) % 5]);
                encryptedText.append(matrix[secondPos[0]][(secondPos[1] + 1) % 5]);
            } else if (firstPos[1] == secondPos[1]) {
                encryptedText.append(matrix[(firstPos[0] + 1) % 5][firstPos[1]]);
                encryptedText.append(matrix[(secondPos[0] + 1) % 5][secondPos[1]]);
            } else {
                encryptedText.append(matrix[firstPos[0]][secondPos[1]]);
                encryptedText.append(matrix[secondPos[0]][firstPos[1]]);
            }
        }
        return encryptedText.toString();
    }

    public String decrypt(String text) {
        StringBuilder decryptedText = new StringBuilder();
        for (int i = 0; i < text.length(); i += 2) {
            char first = text.charAt(i);
            char second = text.charAt(i + 1);
            int[] firstPos = findPosition(first);
            int[] secondPos = findPosition(second);
            if (firstPos[0] == secondPos[0]) {
                decryptedText.append(matrix[firstPos[0]][(firstPos[1] + 4) % 5]);
                decryptedText.append(matrix[secondPos[0]][(secondPos[1] + 4) % 5]);
            } else if (firstPos[1] == secondPos[1]) {
                decryptedText.append(matrix[(firstPos[0] + 4) % 5][firstPos[1]]);
                decryptedText.append(matrix[(secondPos[0] + 4) % 5][secondPos[1]]);
            } else {
                decryptedText.append(matrix[firstPos[0]][secondPos[1]]);
                decryptedText.append(matrix[secondPos[0]][firstPos[1]]);
            }
        }
        return decryptedText.toString();
    }

    private int[] findPosition(char c) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] == c) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        PlayfairCipher2 cipher = new PlayfairCipher2("monarchy");
        String encrypted = cipher.encrypt("This is the input message Before and After Encryption");
        System.out.println("Encrypted: " + encrypted);
        String decrypted = cipher.decrypt(encrypted);
        System.out.println("Decrypted: " + decrypted);
    }

}
