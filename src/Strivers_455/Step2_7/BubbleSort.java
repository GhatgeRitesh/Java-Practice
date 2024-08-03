package Strivers_455.Step2_7;

import java.util.Arrays;

public class BubbleSort {
    // bubble sort : select two consecutive elements sort them
    // end condition : check last element is greater than last but second element in array if yes go for next iteration
    // as we use double for loop the time complexity is O(n^2)
    public static void main(String[] args) {
        int[] arr={13,46,24,52,20,9};
        System.out.println(Arrays.toString(arr));
        System.out.println("Sorting with bubble sort");
        sort(arr);
    }
    public static void sort(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            int didswap=0;
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    didswap=1;
                }
            }
            if(didswap==0) break;
        }
        System.out.println(Arrays.toString(arr));
    }
}
