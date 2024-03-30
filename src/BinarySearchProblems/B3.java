package BinarySearchProblems;

import java.util.Scanner;
import java.util.Arrays;
public class B3 {
    public static void getElement(int[] arr,int tar,int start,int end)
    {
        int result=-1; // result is the index of the element 
        Arrays.sort(arr);
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > tar) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(result);
        if(result>0) // if the element is not present then result value is 0 here 
           System.out.println("the smaller or equal than the element is "+arr[result-1]);

        else
          System.out.println("Not Found / Not present"); 
    }
    public static void main(String[] args) {
        // program to find the nearest smaller than or eqaul to the target number
        // floor probelm from Fanng
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
