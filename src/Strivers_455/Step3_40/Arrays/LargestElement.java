package Strivers_455.Step3_40.Arrays;

import java.util.Arrays;

public class LargestElement {
    //find the largest element in array
    // sorting and without sorting

    //using sort method
    public static void main(String[] args) {

        int[] arr={1,32,5,3,6,57,34,6,79,3,25,57};
        Arrays.sort(arr);
        System.out.println("the largest element is: "+arr[arr.length-1]);
        int[] arr1={1,32,5,3,6,57,34,6,79,3,25,57};
        // using max  supposing array is the non negative numbers
        int max=0;
        for (int j : arr1) {
            if(max<j) max=j;
        }
        System.out.println(max);

    }
}
