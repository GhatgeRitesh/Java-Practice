/*  insertion sort is the partial sorting algorithm used to sort array in palce .
    this algorithm first sorts forst two elements and then in next step it adds one more element in operation and repeat the process
    here it strats with i=0 while i++ and j=i+1 and j-- i for the element and j for the validation 
    if the j is not less than j-1 or in partial array then break the loop to avoid the unneccessory looping

   why to use it? 
   1.Adaptive :steps are reduce if array is sorted 
   2.no. of swaps are reduced as compared to bubble sort
   3.this algorithm is stable algorithm
   4.works well in less values .of n , works good in partially sorted array 
   due to this property this algorithm takes part in hybrid sorting algorithms 
   all the previous algorithms dont work well with the large data 
   this algorithm can be partially implemented woth the other big data algorithms
   
   
*/
import java.util.*;
public class InsertionSort{
    public static void getsort(int[] arr){
     for(int i=0;i<arr.length-1;i++)
     {
     
        for(int j=i+1;j>0;j--){
             if(arr[j]<arr[j-1])
             {
                swap(arr,j,j-1);
             }
             if(!(arr[j]>arr[j-1])){break;}
        }
     }
     System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr,int i,int j){
      int temp=arr[j];
      arr[j]=arr[i];
      arr[i]=temp;
    }
    public static void main(String[] args) {
        int[] arr={77,2};
        getsort(arr);
    }
}

// working completely fine with all the end cases