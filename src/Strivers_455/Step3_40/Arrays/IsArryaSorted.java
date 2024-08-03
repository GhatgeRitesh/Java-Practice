package Strivers_455.Step3_40.Arrays;

import java.util.Arrays;

public class IsArryaSorted {
    // program to check the array is sorted or not
    public static void main(String[] args) {
        // using the linear itteration
        int[] arr={1,32,5,3,6,57,34,6,79,3,25,57};
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("The array is not sorted");
                break;
            }
        }
        System.out.println("The array is sorted");

    }
}
