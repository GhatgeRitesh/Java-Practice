package Recursion;

public class reverseADigit {
    // code to reverse the digit in recursive way
    static int result=0;
    static void reverse(int n) {
         if(n==0)
         {return;}
        int rem=n%10;
        result = result * 10 +rem;
        reverse(n / 10);
    }
    public static void main(String[] args) {
        reverse(1824);
        System.out.println(result);
    }
}
