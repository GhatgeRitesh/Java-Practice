package Strivers_455.Step2_7;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    //program to sort array using merge sort algorithm
    public static void main(String[] args) {
        int[] arr={2,1,4,6,2,6,8,22,6,687,17};
        mergesort(arr,0,arr.length-1);
    }
    public static void mergesort(int[] arr,int s, int e){
         if(s>=e){ return;}
         int mid=(s+e)/2;
         mergesort(arr,s,mid);
         mergesort(arr,mid+1,e);
         combine(arr,s,mid,e);

    }
    public static void combine(int[] arr, int s, int m, int e){
//      ArrayList<Integer> list=new ArrayList<>();
      int i=s;
      int j=m+1;
      int[] temp=new int[arr.length];
      int k=s;
      while(i<=m && j<=e){
//          System.out.println("combine 1");
           if(arr[i]<=arr[j]){
               temp[k]=arr[i];
               i++; k++;
           }
           else{
               temp[k]=arr[j];
               j++;k++;
           }
      }
      while(i<=m){
//          System.out.println("combine 2");
          temp[k]=arr[i];
          i++;k++;
      }
      while(j<=e){
//          System.out.println("combine 3");
          temp[k]=arr[j];
          j++; k++;
      }
        System.out.println("the sorted array:"+ Arrays.toString(temp));
    }
}
//package Strivers_455.Step2_7;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class MergeSort {
//    // Program to sort array using merge sort algorithm
//    public static void main(String[] args) {
//        int[] arr = {2, 1, 4, 6, 2, 6, 8, 22, 6, 687, 17};
//        mergesort(arr, 0, arr.length - 1);
//        System.out.println("The sorted array: " + Arrays.toString(arr));
//    }
//
//    public static void mergesort(int[] arr, int s, int e) {
//        if (s >= e) {
//            return;
//        }
//        int mid = (s + e) / 2;
//        mergesort(arr, s, mid);
//        mergesort(arr, mid + 1, e);
//        combine(arr, s, mid, e);
//    }
//
//    public static void combine(int[] arr, int s, int m, int e) {
//        ArrayList<Integer> list = new ArrayList<>();
//        int i = s;
//        int j = m + 1;
//        while (i <= m && j <= e) {
//            if (arr[i] <= arr[j]) {
//                list.add(arr[i]);
//                i++;
//            } else {
//                list.add(arr[j]);
//                j++;
//            }
//        }
//        while (i <= m) {
//            list.add(arr[i]);
//            i++;
//        }
//        while (j <= e) {
//            list.add(arr[j]);
//            j++;
//        }
//        for (int k = 0; k < list.size(); k++) {
//            arr[s + k] = list.get(k);
//        }
//    }
//}
