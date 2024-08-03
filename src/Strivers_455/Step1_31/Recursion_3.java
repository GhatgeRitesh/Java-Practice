package Strivers_455.Step1_31;

public class Recursion_3 {
    // print 1 to N using recursion
    public static void main(String[] args) {
        int n=5;
        print(0,n);
    }

    public static void print(int i,int n){
        if(i>n) return ;
        System.out.print(i);
        i++;
        print(i,n);
    }
}
