package InformationSecurityPracticals;

import java.security.PublicKey;
import java.util.Base64;
import javax.crypto.Cipher;

public class ClientRSA {

    // Encrypt using Public Key
    public byte[] encrypt(String message, PublicKey publicKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        return cipher.doFinal(message.getBytes());
    }

    public static void main(String[] args) throws Exception {
        // Assume the public key has been received from the server (Base64 encoded)
        String publicKeyBase64 = "<server public key in Base64>"; // replace with actual public key from server
        byte[] publicKeyBytes = Base64.getDecoder().decode(publicKeyBase64);

        // Convert the Base64 encoded key back into a PublicKey object
        java.security.spec.X509EncodedKeySpec keySpec = new java.security.spec.X509EncodedKeySpec(publicKeyBytes);
        java.security.KeyFactory keyFactory = java.security.KeyFactory.getInstance("RSA");
        PublicKey publicKey = keyFactory.generatePublic(keySpec);

        // Message to encrypt
        String message = "Hello Server!";

        // Encrypt the message
        ClientRSA client = new ClientRSA();
        byte[] encryptedMessage = client.encrypt(message, publicKey);

        // Print the encrypted message (Base64 encoded)
        String encryptedBase64Message = Base64.getEncoder().encodeToString(encryptedMessage);
        System.out.println("Encrypted Message (Base64): " + encryptedBase64Message);

        // This encrypted message will be sent to the server
    }
}
