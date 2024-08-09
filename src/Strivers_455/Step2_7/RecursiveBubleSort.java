package Strivers_455.Step2_7;

import java.util.Arrays;

public class RecursiveBubleSort {
    // implementation of recursive bubble sort
    public static void main(String[] args) {
        int[] arr={3,2,5,4,2,7,75,3,2};
        System.out.println(Arrays.toString(arr));
        sort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr,int e)
    {
        if(e==1){return;}

        for(int i=0;i<=e-2;i++){
              if(arr[i]>arr[i+1]){
                  int temp=arr[i];
                  arr[i]=arr[i+1];
                  arr[i+1]=temp;
              }
        }

        sort(arr,e-1);
    }
}
