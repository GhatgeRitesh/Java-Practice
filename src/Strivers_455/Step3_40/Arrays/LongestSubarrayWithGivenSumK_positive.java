package Strivers_455.Step3_40.Arrays;

import java.util.Arrays;

public class LongestSubarrayWithGivenSumK_positive {
    // program to find the longest sub array
    // with the given sum
    public static void main(String[] args) {
        int[] arr={2,3,5,1,1,1,1,1,3,4,5};
        //First point Two pointers
        int i=0; int j=0;
        // variable maximum subarray count
        int max=0;
        int sum =5;
        int checksum=0;
        while(j<arr.length ){
            // Add the current element to checksum
            checksum += arr[j];

            // If checksum exceeds sum, move the start pointer i to the right
            while (checksum > sum && i <= j) {
                checksum -= arr[i];
                i++;
            }

            // If checksum equals sum, calculate the subarray length
            if (checksum == sum) {
                max = Math.max(max, j - i + 1);
            }

            // Move the end pointer j to the right
            j++;

        }
        System.out.println(i+"the max length is: "+max);
        System.out.println(Arrays.toString(Arrays.copyOf(arr,j)));
    }
}
