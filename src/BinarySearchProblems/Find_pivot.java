package BinarySearchProblems;

import java.util.*;
public class Find_pivot {
    // program for finding the pivot element in the rotated array 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={5,6,7,4,3,2,1};
        int pivot=binarysearch(arr,0,arr.length-1);
        System.out.println("the pivot element is ->"+arr[pivot]);
        // problem to find the index of target element in the rotated array using O(logn) TC basically binary search
        System.out.println("enter the target element for the search");
        int tar=sc.nextInt();
        
        System.out.println(search(arr,tar));
    }

    public static int search(int[] arr,int target)
    {
        int pivot=binarysearch(arr,0,arr.length-1);
        //if the pivote is not found means array is not rotated
        if(pivot==-1)
        {
            return binarysearch(arr,0,arr.length-1);
        }
        // if the pivot is found 
        // check the condition if the pivot has itself the target element 
        if(arr[pivot]==target)
        {
            return pivot;
        }

        // if not then find the taget is greater or smaller than the pivot and call the binary search
        if(arr[pivot]>target)
        {
            return binarysearch(arr,0,pivot-1);
        }
        else
        {
            return binarysearch(arr,pivot+1,arr.length-1);
        }
    }
    public static int binarysearch(int[] arr,int s,int e)
    {
       
        while(s<=e)
        {
           int mid=s+(e-s)/2;
           if(mid<e && arr[mid]>arr[mid+1])
           {
            return mid;
           }
           if(mid>s && arr[mid]<arr[mid-1] )
           {
            return mid-1;
           }
           if(arr[mid]<=arr[s])
           {
            e=mid-1;
           }
           else{
            s=mid+1;
           }
        }
        return -1;
    }
}
