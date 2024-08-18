package Strivers_455.Step3_40.Arrays;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        int i=0; int j=1;
        while(j<nums.length){
            if(nums[i]==0 && nums[j]!=0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
                j++;
            }
            if(nums[i]!=0){
                i++;
            }
            j++;
            System.out.println(i+" "+j);
            System.out.println(Arrays.toString(nums));
        }
    }
}
