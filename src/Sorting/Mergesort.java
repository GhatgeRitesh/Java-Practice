package Sorting;

import java.util.*;

public class Mergesort {
    public static void combine(int[] arr,int s,int mid,int e)
    {
        int[] temp=new int[arr.length];
        int i=s;
        int i2=mid+1;
        int x=0;// index of the temp array
         while(i<=mid && i2<=e)
         {
            if(arr[i]<=arr[i2])
            {
                temp[x++]=arr[i++];
            }
            else
            {
                temp[x++]=arr[i2++];
            }
         }
         while(i<=mid)
         {
            temp[x++]=arr[i++];
         }
         while(i2<=e)
         {
            temp[x++]=arr[i2++];
         }
         for(int j=0,z=0;j<arr.length;j++,z++)
         {
           arr[j]=temp[z];
         }
         
    }
    public static void  merge(int[] arr,int s,int e)
    {
        // divide method 
       
        // int mid=s+(e-s)/2;
        // merge(arr,s,mid);
        // merge(arr,mid+1,e);
        // combine(arr,s,mid,e);
        if (s < e) {
            int mid = s + (e - s) / 2;
            merge(arr, s, mid);
            merge(arr, mid + 1, e);
            combine(arr, s, mid, e);
        }
      
    }
   public static void main(String[] args) {
     // program for the merge sort
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the array element");
     int n=sc.nextInt();
     int[] arr=new int[n];
     System.out.println("enter the elements");
     for(int i=0;i<n;i++)
     {
        arr[i]=sc.nextInt();
     }
    merge(arr,0,n-1);
     for(int i=0;i<arr.length;i++)
     {
         System.out.print(arr[i]+" ,");
     }
   }    
}
