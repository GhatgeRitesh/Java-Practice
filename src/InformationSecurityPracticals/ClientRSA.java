package InformationSecurityPracticals;

import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import javax.crypto.Cipher;

public class ClientRSA {

    // Method to encrypt the message using the server's public key
    public byte[] encrypt(String message, PublicKey publicKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        return cipher.doFinal(message.getBytes());
    }

    public static void main(String[] args) throws Exception {
        // Assume we have the server's public key (Base64 encoded) as input
        String publicKeyBase64 = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAsHmoO8EX6kciZ3Z0SmQc7yxEGrNLfXQ4cKQG209lgK84U1mqIElxGPymYgqHxMsMauxlr7ChhXH4QCCVYMoRoYZgGfkY57gkKJqbwFkyH+Im9boSz/XzxqE84Tgo0tIoS2+B7c4FZD1HdcIst0inCvOJxeUkETtN/WSCkcpEdfG91AKOPrTl8T15aV3TEu58LO...\n";  // Actual public key string
        byte[] publicKeyBytes = Base64.getDecoder().decode(publicKeyBase64);


        // Convert the Base64 encoded public key to PublicKey object
        X509EncodedKeySpec spec = new X509EncodedKeySpec(publicKeyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PublicKey publicKey = keyFactory.generatePublic(spec);

        // Message to encrypt and send to the server
        String message = "Hello, Server!";

        // Encrypt the message using the server's public key
        ClientRSA client = new ClientRSA();
        byte[] encryptedMessage = client.encrypt(message, publicKey);

        // Print the encrypted message (Base64 encoded) to send to the server
        String encryptedMessageBase64 = Base64.getEncoder().encodeToString(encryptedMessage);
        System.out.println("Encrypted Message to Server (Base64): " + encryptedMessageBase64);
    }
}
