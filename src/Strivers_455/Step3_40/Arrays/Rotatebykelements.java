package Strivers_455.Step3_40.Arrays;

import java.util.Arrays;

public class Rotatebykelements {
    //program to rotate the array with k elements to left
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,0};
        System.out.println(Arrays.toString(arr));
        int k=3;
        //using the temporary array
       // temparr(arr,k);

        //using the recursion and reversal [swapping]
        rotate(arr,k);
    }
    public static void temparr(int[] arr,int k){
        int[] temp=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        for(int i=0;i<arr.length-k;i++){
            arr[i]=arr[k+i];
        }
        for(int i=arr.length-k,j=0;i<arr.length && j<k;i++,j++){
            arr[i]=temp[j];
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr,int s, int e){
      while(s<=e){
          int temp=arr[s];
          arr[s]=arr[e];
          arr[e]=temp;
          s++;
          e--;
      }
    }
    public static void rotate(int[] arr,int k){
        //rotate first k elements and then rotate remaining array
        // step2 rotate the complete array



        reverse(arr,0,arr.length-k-1);
        reverse(arr,arr.length-k,arr.length-1);
        reverse(arr,0,arr.length-1);

//        [4, 5, 6, 7, 8, 9, 0, 1, 2, 3]
        System.out.println(Arrays.toString(arr));
    }
}
