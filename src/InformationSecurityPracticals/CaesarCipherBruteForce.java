package InformationSecurityPracticals;
public class CaesarCipherBruteForce {

    // Method to decrypt the Caesar Cipher with a given key (shift)
    public static String decrypt(String encryptedText, int shift) {
        StringBuilder decryptedText = new StringBuilder();

        for (int i = 0; i < encryptedText.length(); i++) {
            char ch = encryptedText.charAt(i);

            // Check if character is an uppercase letter
            if (Character.isUpperCase(ch)) {
                char decryptedChar = (char) (((ch - 'A' - shift + 26) % 26) + 'A');
                decryptedText.append(decryptedChar);
            }
            // Check if character is a lowercase letter
            else if (Character.isLowerCase(ch)) {
                char decryptedChar = (char) (((ch - 'a' - shift + 26) % 26) + 'a');
                decryptedText.append(decryptedChar);
            } else {
                // Append non-alphabet characters as they are
                decryptedText.append(ch);
            }
        }

        return decryptedText.toString();
    }

    // Method to perform brute-force attack by trying all possible shifts
    public static void bruteForce(String encryptedText) {
        System.out.println("Brute Force Attack on Caesar Cipher:");

        for (int shift = 1; shift <= 25; shift++) {
            String decryptedText = decrypt(encryptedText, shift);
            System.out.println("Shift " + shift + ": " + decryptedText);
        }
    }

    public static void main(String[] args) {
        // Example encrypted text (shifted using a Caesar cipher)
        String encryptedText = "Wklv lv d whvw phvvdjh"; // "This is a test message" with a shift of 3

        // Perform brute-force attack
        bruteForce(encryptedText);
    }
}

