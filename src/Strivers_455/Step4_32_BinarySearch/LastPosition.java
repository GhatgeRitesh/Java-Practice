package Strivers_455.Step4_32_BinarySearch;

public class LastPosition {
    // program to get  last position of element
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int s=0,e=nums.length-1;
        int tar=8;
        int res=-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(nums[mid]==tar){
                res=mid;
                s=mid+1;
            }
            else if(nums[mid]>tar){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        System.out.println(res);
        s=0;e=nums.length-1;
        int res1=-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(nums[mid]==tar){
                res1=mid;
                e=mid-1;
            }
            else if(nums[mid]<tar){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        System.out.println(res1);
        System.out.println(res-res1+1);
    }
}
