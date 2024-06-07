package Strivers_455.Step1_31;

import java.util.Scanner;

public class O13_reverseNumber {
    // program to reverse a number
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(reversNumber(num));
    }
    static int reversNumber(int num)
    {
        int temp=num;
        int digitcount =0;
        while(temp!=0)
        {
            temp/=10;
            digitcount++;
        }
        while(digitcount!=0){
            int rem=num%10;
            temp=(temp*10)+rem;
            num/=10; digitcount--;
        }
        return temp;
    }
}
