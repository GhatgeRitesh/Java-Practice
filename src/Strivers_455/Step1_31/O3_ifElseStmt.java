package Strivers_455.Step1_31;

import java.util.Scanner;

public class O3_ifElseStmt {
    // to study the if else statment in java

   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a = sc.nextInt();
       if (a == 1) {
           System.out.println("If statment executed");
       }
       else if(a==2)
       {
           System.out.println(" else if () condition executed");
       }
       else{
           System.out.println("Else statement executed ");
       }
       // short hand if
       String result=(a==3)?"true =3":"false=3";
       System.out.println(result);
   }
}
