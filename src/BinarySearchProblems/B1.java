package BinarySearchProblems;

import java.util.*;
public class B1{
    public static void getElement(int[] arr,int tar,int start,int end){
      while(start<=end){
       int  mid=start+(end-start)/2;
        if(arr[mid]==tar)
        {
            System.out.println("target at this position "+mid);
            return ;
        }
        if (tar>mid)
        {
            start=mid+1;
        }
        else if(tar <mid)
        {
            end =mid-1;
        }
      }  
      System.out.println("target not found");
    }
public static void main(String[] args) {
     // simple binary search algorithm 
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[5];
    System.out.println("enter the array 5 elements");
    for(int i=0;i<5;i++)
    {
        arr[i]=sc.nextInt();
    }
    int start=0;int end=arr.length-1;
    System.out.println("enter the target element");
    int tar=sc.nextInt();
    int mid=(start+end)/2;
    getElement(arr,tar,start,end);
  }
}