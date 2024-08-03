package Strivers_455.Step1_31;

public class Recursion_6 {
    // factorial of n
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n));
    }
    static int i=1;
    public static int fact(int n){
        if(n==0)return 1;
        return n* fact(n-1);
    }
}
