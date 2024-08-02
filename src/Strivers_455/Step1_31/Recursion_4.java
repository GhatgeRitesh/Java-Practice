package Strivers_455;

public class Recursion_4 {
    // print n to 1
    public static void main(String[] args) {
        int n=5;
        print(n,n);
    }
    public static void print(int i, int n){
        if(i==0) return;
        System.out.print(i);
        print(i-1,n);
    }
}
