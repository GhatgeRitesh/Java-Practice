package Strivers_455.Step2_7;

import java.util.Arrays;

public class SelectionSort {
    // implement and revise the selection sort
    // find the minimum from the range and swap to first position
    // it can be implemented in-place swapping of array
    public static void main(String[] args) {
//        int[] arr={4,2,6,8,3,8,1,5,7};
        int[] arr={100000,1,5,-2,3,-443};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        int i=0;
        int j=arr.length;
        while(i<j){
            int min=arr[i];
            int index=i;
            for( int z=i+1;z<j;z++){
                if(arr[z]<min){
                    min=arr[z];
                    index=z;
                }
            }
            swap(i,index,arr);
            i++;
        }
    }
    public static void swap(int a, int b,int[] arr){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
