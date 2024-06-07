package Strivers_455.Step1_31;

import java.util.Scanner;

public class O12_countDigits {
    // problem to count digits in givin integer
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(countDigit(num));
    }
//     static int countDigit(int num,int count){
//
//         if(num!=0) {
//             countDigit(num / 10,count=count+1);
//         }
//         return count;
//    } -- recursion method not working
     static int count=0;
     static int countDigit(int num)
     {
         if(num!=0) {
             count++;
             countDigit(num / 10);
         }
         return count;
     }
}
