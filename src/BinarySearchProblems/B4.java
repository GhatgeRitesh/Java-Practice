package BinarySearchProblems;

import java.util.*;
 // program for finding the first and last occurence of object in array
      // using Binary search as an function 
      // handling condition like half right and Half left position
// Binary searh only work on sorted array

public class B4 {
    public static int search(int[] arr ,int target,boolean first)
    {   int result=-1;
        int start=0; 
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target>arr[mid])
            {
               start=mid+1;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
            }
            else{
                  result=mid;
                  if(first)
                  {
                    end=mid-1;
                  }
                  else{
                    start=mid+1;
                  }
            }
        }
        return result;
    }
   public static void main(String[] args){
     
      // if nothind found print arr{-1,-1}
      int[] nums={-1,-1};
      Scanner sc=new Scanner(System.in);
      int[] arr=new int[5];
      System.out.println("enter the 5 array elements ");
      for(int i=0;i<5;i++)
      {
        arr[i]=sc.nextInt();
      }
      System.out.println("Enter the target Element");
      int target=sc.nextInt();
      Arrays.sort(arr);
       nums[0]=search(arr,target,true);
       nums[1]=search(arr,target,false);
      System.out.println("First and Last Occurance of Target is");
      for(int i=0;i<2;i++){
      System.out.println(nums[i]);
      }
   }    
}
