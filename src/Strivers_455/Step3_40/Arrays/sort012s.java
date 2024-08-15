package Strivers_455.Step3_40.Arrays;

import java.util.Arrays;

public class sort012s {
    // program to sort the 0's 1's and 2's in the arr
    public static void main(String[] args) {
        int[] nums={2,0,2,1,1,0};
        System.out.println(Arrays.toString(nums));
        for(int i=0; i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]) {
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        int[] nums1={2,0,2,1,1,0};
        System.out.println(Arrays.toString(nums1));
        System.out.println(Optimize(nums));
    }
    public static int[] Optimize(int[] nums){
        int s=0,e=nums.length-1;
        while(s<e){
            if(nums[s]!=0){

            }
        }
        return nums;
    }
}
