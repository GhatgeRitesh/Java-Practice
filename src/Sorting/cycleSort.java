/*
 * This sorting algorithms is important for the interview prepration .
 * it is used when  the array numbers are in the given range like 1-->n. -- Very vVery important.
 * this code is used as find the missing number form the given unsrted array , find the minimum positive missing  number from the unsorted array.
 * finding the duplicate number .
 * the time complexity is O(n) in worst case secanario.
 *  
 * in cyclic sort the space complexity is same as it is the inplace sorting algoruthm
 */
import java.util.*;
public class cycleSort {
    public static void getCycleSort(int[] arr){
      int i=0;
      while(i<arr.length)
      {
        int checkindex=arr[i]-1;  //if(index==number a|| index ==number+1) checkindex can change  basic condition is that to compare the index and elements of the array as
        if(arr[i]!=arr[checkindex])
        {
            swap(arr,i,checkindex);
        }
        else{
            i++;
        }
      }
    }
    static void swap(int[] arr, int a,int b){
           int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
    }
    public static void main(String[] args) {
        int[] arr={3,5,2,1,4};
        getCycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
