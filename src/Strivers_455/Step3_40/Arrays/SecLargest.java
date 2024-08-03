package Strivers_455.Step3_40.Arrays;

import java.util.Arrays;

public class SecLargest {
    // code to find second largest from array without sorting array
    public static void main(String[] args) {
        // without sorting array
        int[] arr={2,4,2,56,43,25,64,7,87,45,34};
        System.out.println(Arrays.toString(arr));
        // using max and second max
        int max=0;
        int second=0;
        for(int i:arr){
            if(max<i){
                second=max;
                max=i;
            }
        }
        System.out.println(second +" "+max);
    }
}
