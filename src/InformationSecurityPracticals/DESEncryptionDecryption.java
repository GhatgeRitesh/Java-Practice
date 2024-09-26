package InformationSecurityPracticals;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.nio.file.Files;

public class DESEncryptionDecryption {

    // Method to generate a DES secret key
    public static SecretKey generateKey() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("DES");
        keyGenerator.init(56); // DES uses a key size of 56 bits
        return keyGenerator.generateKey();
    }

    // Method to perform DES encryption
    public static String encrypt(String data, SecretKey secretKey) throws Exception {
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedData = cipher.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encryptedData); // Convert encrypted data to Base64 format
    }

    // Method to perform DES decryption
    public static String decrypt(String encryptedData, SecretKey secretKey) throws Exception {
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decryptedData = cipher.doFinal(Base64.getDecoder().decode(encryptedData)); // Decode Base64 encrypted data
        return new String(decryptedData);
    }

    public static void main(String[] args) {
        try {
            // Generate a DES key
            SecretKey secretKey = generateKey();

            String filepath="D:/db schema.txt";
            File file=new File(filepath);
            byte[] byteArray = new byte[(int) file.length()];
            String originalData;
            StringBuilder sb=new StringBuilder();
            try (FileInputStream fis = new FileInputStream(file)) {
                fis.read(byteArray);
                // Read file content into byteArray
            }
            for(int c:byteArray){
                sb.append((char) c);
            }


            System.out.println("This is the Original file Data");
            System.out.println(sb.toString());
            originalData= Arrays.toString(byteArray);
//            System.out.println("Original Data: " + originalData);

            // Encrypt the data

            String encryptedData = encrypt(originalData, secretKey);
            System.out.println("Encrypted Data: " + encryptedData);
            String filePath1="D:/EncryptedFile.txt";
            Files.write(Path.of(filePath1), encryptedData.getBytes());
            // Decrypt the data
            String decryptedData = decrypt(encryptedData, secretKey);
            System.out.println("Decrypted Data: " + decryptedData);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

