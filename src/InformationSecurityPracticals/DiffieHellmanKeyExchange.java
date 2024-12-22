package InformationSecurityPracticals;

import java.math.BigInteger;
import java.security.SecureRandom;

public class DiffieHellmanKeyExchange {

    // write a program to implement diffie hellman algorithem
    public static void main(String[] args) {
        System.out.println("Implementing Diffie Hellman Key Exchange Algorithm");

                // Step 1: Publicly Shared Prime 'p' and Generator 'g'
                BigInteger p = new BigInteger("23");  // A prime number
                BigInteger g = new BigInteger("5");   // A primitive root modulo p

                System.out.println("Publicly Shared Variables:");
                System.out.println("Prime Number (p): " + p);
                System.out.println("Primitive Root (g): " + g);

                // Step 2: Alice chooses a private key (a)
                SecureRandom rand = new SecureRandom();
                BigInteger a = new BigInteger(20, rand).mod(p);  // Alice's private key (random number < p)
                System.out.println("\nAlice's Private Key (a): " + a);

                // Step 3: Bob chooses a private key (b)
                BigInteger b = new BigInteger(20, rand).mod(p);  // Bob's private key (random number < p)
                System.out.println("Bob's Private Key (b): " + b);

                // Step 4: Alice computes her public key to send to Bob
                BigInteger A = g.modPow(a, p);  // A = g^a mod p
                System.out.println("\nAlice's Public Key (A) to send to Bob: " + A);

                // Step 5: Bob computes his public key to send to Alice
                BigInteger B = g.modPow(b, p);  // B = g^b mod p
                System.out.println("Bob's Public Key (B) to send to Alice: " + B);

                // Step 6: Alice computes the shared secret key
                BigInteger sharedSecretAlice = B.modPow(a, p);  // Secret = B^a mod p
                System.out.println("\nAlice's Computed Shared Secret Key: " + sharedSecretAlice);

                // Step 7: Bob computes the shared secret key
                BigInteger sharedSecretBob = A.modPow(b, p);  // Secret = A^b mod p
                System.out.println("Bob's Computed Shared Secret Key: " + sharedSecretBob);

                // The shared secret keys computed by both Alice and Bob should be the same
                if (sharedSecretAlice.equals(sharedSecretBob)) {
                    System.out.println("\nKey Exchange Successful! Shared Secret Key: " + sharedSecretAlice);
                } else {
                    System.out.println("\nKey Exchange Failed!");
                }
    }
}
