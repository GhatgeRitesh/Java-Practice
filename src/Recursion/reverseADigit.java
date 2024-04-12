package Recursion;

public class reverseADigit {
    // code to reverse the digit in recursive way

    // with the help of this code you can validate the palindrome number
    // again with the help of this methodology one can count the specific digit in number

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
        System.out.println(countzero(102022340));
    }

    // method to count the zeros in the number
    static int count=0;
    static int countzero(int n){
        if(n==0)
        {
            return n;
        }
        int rem=n%10;
        if(rem==1)
        {
            count++;
        }
        countzero(n/10);
        return count ;
    }
}
