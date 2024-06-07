package Strivers_455.Step1_31;

import java.util.Scanner;

public class O14_checkPalindrome {
    // program to check the palindrome number in java
    // check for the string , array of strings and chars

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        System.out.println("the number is :"+checkPalindrome(num));
    }

    // try to solve this question with recursion
    static int temp=0;

    static String checkPalindrome(int num)
    {

        while(num!=0)
        {
            temp=(temp*10)+num%10;
            System.out.println(temp+"<--");
            checkPalindrome(num/=10);
        }
        System.out.println("num->"+num);
        return (temp==num)?"isPalindrome":"notPalindrome";
    }
}
