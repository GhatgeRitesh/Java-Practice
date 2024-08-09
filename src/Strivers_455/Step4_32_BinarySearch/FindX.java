package Strivers_455.Step4_32_BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class FindX {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));
//        System.out.println("enter the number to find index");
//        Scanner sc=new Scanner(System.in);
//        int x=sc.nextInt();
        System.out.println((8-5)/2);
        search(arr,6);
    }
    public static void search(int[] arr,int x){
        int start=0;
        int end=arr.length-1;
        while(end>=start){
            int mid=start+(end-start)/2;
            if(arr[mid]==x){
                System.out.println("The element is on index :"+mid);
                break;
            }
            if(arr[mid]>x){
                end=mid-1;
//                System.out.print("<");
            }
            if(arr[mid]<x){
                start=mid+1;
//                System.out.print("<");
            }
        }
    }
}
