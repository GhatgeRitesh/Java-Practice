package Sorting;

import java.util.Arrays;

public class collectZeroToLeft {

    // program to collect the all zeros to left while maintaining relative oreder of all non-zero array elements

    //method
    static void sort(int[] arr)
    {
        // creating two pointers to itterate over the array
         // tomorrow morning session
        //  🫡
        System.out.println("into sort");
        int temp1=0;
        int temp2=0;
        while(temp1<arr.length)
        {
            if(arr[temp1]!=0)
            {

                int temp = arr[temp1];
                arr[temp1] = arr[temp2];
                arr[temp2] = temp;
                temp2++;
                System.out.println(Arrays.toString(arr));
            }
            temp1++;
            
        }

    }
    static void swap(int[] arr,int temp1,int temp2)
    {
        System.out.println("into swap");
        int temp=arr[temp1];
        arr[temp1]=arr[temp2];
        arr[temp2]=arr[temp];
    }

    public static void main(String[] args) {
     int[] arr={1,3,0,2,0,4,7,0,9};
     sort(arr);
     System.out.println(Arrays.toString(arr));
    }

}
