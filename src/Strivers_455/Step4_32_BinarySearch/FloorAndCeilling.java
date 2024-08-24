package Strivers_455.Step4_32_BinarySearch;

import java.util.Arrays;

public class FloorAndCeilling {
    // program to find floor and cealing of the given number
    // floor is largest element in array which is smaller or equal to x
    // ceiling is smallest element which is greater than or equal to
    public static void main(String[] args) {
        int[] nums={3, 4, 4, 7, 8, 10};
        int x=5;
        System.out.println(findceil(nums,x));
        System.out.println(getfloor(nums,x));
    }
    public static int findceil(int[] nums, int x){
        int s=0,e=nums.length-1;
        int ans=-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(nums[mid]>=x){
                ans=nums[mid];
                e=mid-1;
            }
            else{
                s=mid+1;

            }
        }
        return ans;
    }
    public static int getfloor(int[] nums, int x){
       int ans=-1;
       int s=0,e=nums.length-1;
       while(s<=e){
        int mid=(s+e)/2;
        if(nums[mid]<=x){
            ans=nums[mid];
            s=mid+1;
        }
        else{
            e=mid-1;

        }
       }
        return ans;
    }
}
