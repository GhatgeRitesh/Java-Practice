package BinarySearchProblems;

import java.util.*;
public class B2 {
    public static void getElement(int[] arr,int tar,int start,int end)
    {
        int result=-1; // result is the index of the element 
        
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > tar) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if(result!=-1)
           System.out.println("the grater than the element is "+arr[result]);

        else
          System.out.println("Not Found / Not present"); 
    }
    public static void main(String[] args) {
        // program for the Binary Search Problem 
        // ceiling problem By the Faang Get the Smallest Grater Element than the target element in array present
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        int n=arr.length;
        System.out.println("enter the 5 array elements");
        for(int i=0;i<5;i++){
          arr[i]=sc.nextInt();
        }
        System.out.println("enter the target element");
        int tar=sc.nextInt();
        int start=0;int end=n-1;
        getElement(arr,tar,start,end);
    }
}
