package InformationSecurityPracticals;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import javax.crypto.Cipher;
import java.util.Base64;

public class SimpleRSA {

    // Method to generate RSA key pair (public and private keys)
    public static KeyPair generateKeyPair() throws Exception {
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(2048, new SecureRandom()); // Key size is 2048 bits
        return keyGen.generateKeyPair();
    }

    // Method to encrypt the message using the public key
    public static String encrypt(String plainText, PublicKey publicKey) throws Exception {
        Cipher encryptCipher = Cipher.getInstance("RSA");
        encryptCipher.init(Cipher.ENCRYPT_MODE, publicKey);

        byte[] encryptedBytes = encryptCipher.doFinal(plainText.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes); // Return Base64 encoded encrypted text
    }

    // Method to decrypt the message using the private key
    public static String decrypt(String encryptedText, PrivateKey privateKey) throws Exception {
        Cipher decryptCipher = Cipher.getInstance("RSA");
        decryptCipher.init(Cipher.DECRYPT_MODE, privateKey);

        byte[] decryptedBytes = decryptCipher.doFinal(Base64.getDecoder().decode(encryptedText));
        return new String(decryptedBytes); // Return decrypted plain text
    }

    public static void main(String[] args) throws Exception {
        // Generate RSA key pair
        KeyPair keyPair = generateKeyPair();

        // Get the public and private keys
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();

        // The plain text message to be encrypted
        String plainText = "This is the message to be sent806 goiyb vn8tyuiny 0987guih 0g8yd45y678ju9]';/";

        // Encrypt the plain text using the public key
        String encryptedText = encrypt(plainText, publicKey);
        System.out.println("Encrypted Text: " + encryptedText);

        // Decrypt the encrypted text using the private key
        String decryptedText = decrypt(encryptedText, privateKey);
        System.out.println("Decrypted Text: " + decryptedText);
    }
}

