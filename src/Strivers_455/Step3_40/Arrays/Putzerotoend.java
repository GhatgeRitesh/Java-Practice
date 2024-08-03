package Strivers_455.Step3_40.Arrays;

import java.util.Arrays;

public class Putzerotoend {
    //program to put all zeros to end of array
    //keeping sequence intact
    public static void main(String[] args) {
        int[] arr={1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        System.out.println(Arrays.toString(arr));

        //by creating temporary array
        brute(arr);

        //Optimal two pointers , in-place , O(n)tc , O(1)sp
        optimal(arr);
    }
    public static void optimal(int[] a){
        int j = -1;
        int n=a.length;
        //place the pointer j:
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }

        //no non-zero elements:
        if (j == -1) return;

        //Move the pointers i and j
        //and swap accordingly:
        for (int i = j + 1; i < n; i++) {
            if (a[i] != 0) {
                //swap a[i] & a[j]:
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                j++;
            }
        }

    }

    public static void brute(int[] arr){
        int[] temp=new int[arr.length];
        int j=0;
        for (int k : arr) {
            if (k != 0) {
                temp[j] = k;
                j++;
            }
        }
        for(int i=j;i<arr.length;i++){
            temp[i]=0;
        }
        System.out.println(Arrays.toString(temp));
    }
}
