package Strivers_455.Step3_40.Arrays;

import java.util.Arrays;

public class rotateOnetoleft {
    //code to rotate the array by one place in left
    public static void main(String[] args) {
        //using brute force method
        int[] arr={1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        //using bruteforce
        temparr(arr);

        //optimal approach
        optimalinplace(arr);
    }
    public static void temparr(int[] arr){
        int[] temp=new int[arr.length];
        temp[arr.length-1]=arr[0];
        for(int i=0;i<arr.length-1;i++){
            temp[i]=arr[i+1];
        }
        System.out.println(Arrays.toString(temp));
    }

    public static void optimalinplace(int[] arr){
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
