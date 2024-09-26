package InformationSecurityPracticals;

import java.util.Scanner;

public class HillCipher {
    public static int[] encrypt(int[][] keyMatrix, int[] plaintextVector) {
        int[] result = new int[plaintextVector.length];

        for (int i = 0; i < keyMatrix.length; i++) {
            result[i] = 0;
            for (int j = 0; j < keyMatrix[i].length; j++) {
                result[i] += keyMatrix[i][j] * plaintextVector[j];
            }
            result[i] = result[i] % 26;
        }

        return result;
    }


    public static int modInverse(int a, int m) {
        a = a % m;
        for (int x = 1; x < m; x++) {
            if ((a * x) % m == 1)
                return x;
        }
        return 1;
    }


    public static int determinant(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) -
                matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) +
                matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }


    public static int[][] inverseKeyMatrix(int[][] keyMatrix) {
        int determinant = determinant(keyMatrix) % 26;
        if (determinant < 0) {
            determinant += 26;
        }

        int inverseDeterminant = modInverse(determinant, 26);


        int[][] adjugate = new int[3][3];
        adjugate[0][0] = (keyMatrix[1][1] * keyMatrix[2][2] - keyMatrix[1][2] * keyMatrix[2][1]) % 26;
        adjugate[0][1] = -(keyMatrix[0][1] * keyMatrix[2][2] - keyMatrix[0][2] * keyMatrix[2][1]) % 26;
        adjugate[0][2] = (keyMatrix[0][1] * keyMatrix[1][2] - keyMatrix[0][2] * keyMatrix[1][1]) % 26;
        adjugate[1][0] = -(keyMatrix[1][0] * keyMatrix[2][2] - keyMatrix[1][2] * keyMatrix[2][0]) % 26;
        adjugate[1][1] = (keyMatrix[0][0] * keyMatrix[2][2] - keyMatrix[0][2] * keyMatrix[2][0]) % 26;
        adjugate[1][2] = -(keyMatrix[0][0] * keyMatrix[1][2] - keyMatrix[0][2] * keyMatrix[1][0]) % 26;
        adjugate[2][0] = (keyMatrix[1][0] * keyMatrix[2][1] - keyMatrix[1][1] * keyMatrix[2][0]) % 26;
        adjugate[2][1] = -(keyMatrix[0][0] * keyMatrix[2][1] - keyMatrix[0][1] * keyMatrix[2][0]) % 26;
        adjugate[2][2] = (keyMatrix[0][0] * keyMatrix[1][1] - keyMatrix[0][1] * keyMatrix[1][0]) % 26;


        int[][] inverseMatrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverseMatrix[i][j] = adjugate[i][j] * inverseDeterminant % 26;
                if (inverseMatrix[i][j] < 0) {
                    inverseMatrix[i][j] += 26;
                }
            }
        }

        return inverseMatrix;
    }


    public static int charToNumber(char c) {
        return c - 'A';
    }


    public static char numberToChar(int n) {
        return (char) (n + 'A');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[][] keyMatrix = {
                {6, 24, 1},
                {13, 16, 10},
                {20, 17, 15}
        };

        System.out.print("Enter the plaintext: ");
        String plaintext = sc.nextLine().toUpperCase().replaceAll("[^A-Z]", "");


        while (plaintext.length() % 3 != 0) {
            plaintext += "X";
        }

        System.out.println("Padded plaintext: " + plaintext);


        StringBuilder ciphertext = new StringBuilder();
        for (int i = 0; i < plaintext.length(); i += 3) {
            int[] plaintextVector = {
                    charToNumber(plaintext.charAt(i)),
                    charToNumber(plaintext.charAt(i + 1)),
                    charToNumber(plaintext.charAt(i + 2))
            };

            int[] ciphertextVector = encrypt(keyMatrix, plaintextVector);

            for (int j = 0; j < 3; j++) {
                ciphertext.append(numberToChar(ciphertextVector[j]));
            }
        }

        System.out.println("Encrypted ciphertext: " + ciphertext);


        StringBuilder decryptedText = new StringBuilder();
        int[][] inverseMatrix = inverseKeyMatrix(keyMatrix);

        for (int i = 0; i < ciphertext.length(); i += 3) {
            int[] ciphertextVector = {
                    charToNumber(ciphertext.charAt(i)),
                    charToNumber(ciphertext.charAt(i + 1)),
                    charToNumber(ciphertext.charAt(i + 2))
            };

            int[] decryptedVector = encrypt(inverseMatrix, ciphertextVector);

            for (int j = 0; j < 3; j++) {
                decryptedText.append(numberToChar(decryptedVector[j]));
            }
        }

        System.out.println("Decrypted plaintext: " + decryptedText);

        sc.close();
    }
}
