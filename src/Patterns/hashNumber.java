package Patterns;

import java.util.*;
import java.util.Scanner;

public class hashNumber {
    // code to create hash id with the unique Name
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name");
        String Name=sc.nextLine();
        System.out.println("Enter Email");
        String Email=sc.nextLine();
        generateUniqueKey(Name,Email);

    }
    public static void generateUniqueKey(String name, String email) {
        // Concatenate name and email
        String combinedData = name + email;

        // Calculate hash code
        int hashCode = Objects.hash(combinedData);

        // Convert hash code to 6-digit key
        String key = String.format("%06d", Math.abs(hashCode) % 1000000);

        System.out.println(key);
    }
    //357127
    //733032
}
