package Strivers_455.Step2_7;

import java.util.Arrays;

public class InsertionSort {
    // InsertionSort is the sort to check the one element is greater than other and swap them and check for the successor is greater than or not
    // takes the O(n^2) time complexity
    public static void main(String[] args) {
        int[] arr={13,46,24,52,20,9};
        System.out.println(Arrays.toString(arr));
        sort(arr);
    }
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
