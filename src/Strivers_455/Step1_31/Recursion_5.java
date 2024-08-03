package Strivers_455.Step1_31;

public class Recursion_5 {
    // sum of first n numbers
    public static void main(String[] args) {
        int n=10;
        sum(n,0);
        int sum=0;
        for(int i=0;i<=10;i++)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
    public static void sum(int n, int sum){
        if(n==0) {System.out.println(sum);return;}
        sum(n-1, sum+=n);
    }
}
