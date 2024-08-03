package Strivers_455.Step1_31;

public class Recursion_2 {
    // print n time
    public static void main(String[] args) {
        System.out.println("printing number for n time");
        int n=6;
        printthing(0,n);
    }
    public static void printthing(int i,int n){
        // base condition
        if(i>n)return;
        System.out.print(i);

        //recursion call
        printthing(i+1,n);
    }
}
