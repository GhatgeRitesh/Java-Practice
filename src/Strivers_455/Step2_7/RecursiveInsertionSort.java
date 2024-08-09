package Strivers_455.Step2_7;

import java.util.Arrays;

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int[] arr={2,5,1,6,8,2,4,6,3};
        System.out.println(Arrays.toString(arr));
        sort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr, int i, int n){
        if(i==n) return;
        int j=i;
        while(j > 0 && arr[j-1] > arr[j]){
          int temp= arr[j-1];
          arr[j-1]=arr[j];
          arr[j]=temp;
          j--;
        }

        sort(arr,i+1,n);
    }

}
