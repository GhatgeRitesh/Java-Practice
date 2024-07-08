package Strivers_455.Step3_1.Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate {
    //program to remove duplicates from sorted array
    public static void main(String[] args) {
        // iterate over the array find the duplicate
        int[] arr={1,1,2,3,2,3,77,56,34345,234,4,5,6,3,4};
//        ArrayList<Integer> list=new ArrayList<>();
//        // using the double for loop with temporary array
//        for(int i=0;i<arr.length;i++)
//        {
//          if(!list.contains(arr[i])){
//              list.add(arr[i]);
//          }
//        }
//
//        System.out.println(Strivers_455.Step3_1.Arrays.toString(list.toArray()));
//        byset(arr);

        Arrays.sort(arr);
        //using two pointers
        byPointers(arr);
    }

    //using the set
    public static void byset(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        int k=set.size();
        int j=0;
        for(int x:set){
            arr[j++]=x;
        }
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void byPointers(int[] arr){
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        for(int k=0;k<i+1;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
