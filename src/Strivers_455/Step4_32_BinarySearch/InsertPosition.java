package Strivers_455.Step4_32_BinarySearch;

import java.util.Arrays;

public class InsertPosition {
    // problem to find the insert position of element in sorted array keeping it sorted using binary search algorithm
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int tar=1;
        // find insert position using binary sorting
        System.out.println(Arrays.toString(arr));
        System.out.println("The insert position is : "+find(arr,tar));
    }
    public static int find(int[] nums,int target){

            int left = 0;
            int right = nums.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            return left;
        }
}
