package Maps_In_Java;

import java.util.Scanner;

public class StriverHashing_chars {
    // code to hash characters from the given string
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        String s= sc.nextLine();

        // preprocessing
        int n=s.length();
        // if there are more characters make hash size 256 and don't need to minus
        int hash[]=new int[256]; // if chars are small/large case  you can declare 26 and use 'char'-'a'
        int i=0;
        while(i!=n){
            int c=s.charAt(i); // if specific chars : s.charAt(i)-'a'
            hash[c]+=1;
            i++;
        }
        // fetching w
        System.out.println("Enter the test cases ");
        int m=sc.nextInt();
        while(m!=0){
            System.out.println("Enter the char");
            char q=sc.next().charAt(0);
            System.out.println(hash[q]+": Frequency of char in given String ");
            m--;
        }
    }
}
