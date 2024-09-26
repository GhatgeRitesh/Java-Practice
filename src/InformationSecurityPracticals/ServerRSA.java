package InformationSecurityPracticals;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;
import javax.crypto.Cipher;

public class ServerRSA {

    private PrivateKey privateKey;
    private PublicKey publicKey;

    // Generate RSA Key Pair
    public void generateKeyPair() throws Exception {
        KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
        generator.initialize(2048);  // Key size
        KeyPair pair = generator.generateKeyPair();
        this.privateKey = pair.getPrivate();
        this.publicKey = pair.getPublic();
    }

    // Getter for Public Key (for sharing with the client)
    public PublicKey getPublicKey() {
        return this.publicKey;
    }

    // Decrypt using Private Key
    public String decrypt(byte[] encryptedMessage) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] decryptedBytes = cipher.doFinal(encryptedMessage);
        return new String(decryptedBytes);
    }

    public static void main(String[] args) throws Exception {
        // Initialize server and generate keys
        ServerRSA server = new ServerRSA();
        server.generateKeyPair();

        // Print Public Key (to be shared with client)
        System.out.println("Public Key (Base64): " + Base64.getEncoder().encodeToString(server.getPublicKey().getEncoded()));

        // Assume this encrypted message is received from the client
        String encryptedMessage = "<received encrypted message in Base64>"; // replace with actual encrypted message
        byte[] encryptedBytes = Base64.getDecoder().decode(encryptedMessage);

        // Decrypt the message
        String decryptedMessage = server.decrypt(encryptedBytes);
        System.out.println("Decrypted Message: " + decryptedMessage);
    }
}

