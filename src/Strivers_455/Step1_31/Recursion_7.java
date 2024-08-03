package Strivers_455.Step1_31;

import java.util.Arrays;

public class Recursion_7 {
    // reverse an array in place not print the array
    public static void main(String[] args) {
        int[] n={1,2,3,4,5};
        reverse(n,0);
        System.out.println(" ");
        reverseArray(n,0,n.length-1);
        System.out.println(Arrays.toString(n));
    }
    //reversing the same array using the swapping method
    public static void reverseArray(int[] arr,int s,int e){
        if(s>e) {for(int i:arr){
            System.out.print(i);} return;}
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        reverseArray(arr,s+1,e-1);
    }
    public static void reverse(int[] n,int i){
        if(i>n.length-1)return;
        reverse(n,i+1);
        System.out.print(n[i]);
    }
}
