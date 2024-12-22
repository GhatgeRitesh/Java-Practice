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

    // Method to generate the RSA Key Pair (Public and Private)
    public void generateKeyPair() throws Exception {
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
        keyPairGen.initialize(2048); // Key size of 2048 bits
        KeyPair pair = keyPairGen.generateKeyPair();
        this.privateKey = pair.getPrivate();
        this.publicKey = pair.getPublic();
    }

    // Get Public Key to share with the client
    public PublicKey getPublicKey() {
        return this.publicKey;
    }

    // Method to decrypt the received encrypted message using the private key
    public String decrypt(byte[] encryptedMessage) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] decryptedBytes = cipher.doFinal(encryptedMessage);
        return new String(decryptedBytes);
    }

    public static void main(String[] args) throws Exception {
        // Server generates the RSA key pair
        ServerRSA server = new ServerRSA();
        server.generateKeyPair();

        System.out.println("Server's Public Key (Base64): " + Base64.getEncoder().encodeToString(server.getPublicKey().getEncoded()));


        // Assume the server receives the encrypted message from the client (Base64 encoded)
        String encryptedMessageBase64 = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAsHmoO8EX6kciZ3Z0SmQc7yxEGrNLfXQ4cKQG209lgK84U1mqIElxGPymYgqHxMsMauxlr7ChhXH4QCCVYMoRoYZgGfkY57gkKJqbwFkyH+Im9boSz/XzxqE84Tgo0tIoS2+B7c4FZD1HdcIst0inCvOJxeUkETtN/WSCkcpEdfG91AKOPrTl8T15aV3TEu58LO...\n";  // replace with actual encrypted message
        byte[] encryptedMessage = Base64.getDecoder().decode(encryptedMessageBase64);

        // Decrypt the message
        String decryptedMessage = server.decrypt(encryptedMessage);
        System.out.println("Decrypted Message from Client: " + decryptedMessage);
    }
}
