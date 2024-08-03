package Strivers_455.Step1_31;

public class Recursion_1 {
    // program to understand and use recursion
    public static void main(String[] args) {
        System.out.println("Printing something for n times with simple and recursive stack");
        printNtimes(5);
        printRecursiveStack(5);
    }
    static int i=1;
    public static void printNtimes(int n){
        if(i==n+1){
            return ;
        }
        System.out.print(i);
        i++;
        printNtimes(n);
    }
    static int  j=1;
    public static void printRecursiveStack(int n){
        if(j==n+1) {return ;}
        j++;
        printRecursiveStack(n);
        int[] i=new int[7];
        i[j-1]=j;
        for(int j:i){
            System.out.print(j);
        }
    }
}
