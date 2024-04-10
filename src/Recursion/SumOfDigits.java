package Recursion;

public class SumOfDigits {
    // code to get the sum of digits in recursion
    static int getsum(int n){
        if(n==0)
        {
            return 0;
        }
        return n%10+getsum(n/10);
    }
    public static void main(String[] args) {
        System.out.println(getsum(1111));
    }
}
