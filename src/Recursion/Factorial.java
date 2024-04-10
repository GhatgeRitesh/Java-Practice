package Recursion;

public class Factorial {
    //code to create the return type recursion

    static int getFactorial(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n*getFactorial(n-1);

    }

    public static void main(String[] args) {
        System.out.println(getFactorial(3));
    }
}
