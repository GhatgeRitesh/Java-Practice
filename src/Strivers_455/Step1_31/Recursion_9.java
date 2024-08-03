package Strivers_455.Step1_31;

import java.util.ArrayList;

public class Recursion_9 {
    // program to develop fibonacci series
    public static void main(String[] args) {

        int n=5;
        System.out.println(fibo(n));
        getseries(n);
    }
    public static int fibo(int n){
        if(n<2)return n;

        return fibo(n-1)+fibo(n-2);
    }
    public static int getseries(int n){
        if(n<=1)
        {
            return n;
        }
        ArrayList<Integer> num=new ArrayList<>();
        num.add(n);
        System.out.print(n);
        return getseries(n-1) +getseries(n-2);
    }
}