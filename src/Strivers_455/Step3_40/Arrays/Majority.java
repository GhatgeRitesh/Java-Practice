package Strivers_455.Step3_40.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class Majority {
    public static void main(String[] args) {
        int[] arr={2,2,1,1,1,2,2};
        //nive approach
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=i;j<arr.length;j++){
                if(arr[i]==arr[j]) count++;
            }
            if(count>=arr.length/2) {System.out.println(arr[i]); break;}
        }
        // better approach is with while loop and counter
        // optimized approach is about dutch flag algorithm
    }
}
