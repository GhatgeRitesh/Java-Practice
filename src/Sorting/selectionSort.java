/*selection sort is used to as the swapping sort 
  using the selection sort the last index gets sort the firstly as the buble sort 
   
  in this algorithm we select first element that is the largest into the array
  then it is swapped with the last element of the array
  hence the array is sorted for the last element.

  now we have to consider the array to select next highest value element from the arr-last element.

  with this repeatedly using we get the sorted array

  time complexity for the algorithm is O(n^2) in both worst and best Case.
  it is not stable algorithm 
  it only works well with the small lists.
   space complexity is same as it is on array conversion.
*/
import java.util.*;

public class selectionSort {
    public static void selectionsort(int [] arr){
        // two loops one outer to handle the array length for max element
        
        for(int i=0;i<arr.length;i++)
        {
         int last=arr.length-i-1;
         int max=getmax(arr,0,last);
         swap(arr,max,last);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static  int getmax(int[] arr,int start,int last){
       int max=0;
        for(int i=start;i<=last;i++)
        {
          if(arr[max]<arr[i])
          {
            max=i;
          }
        }
        return max;
    }

    public static void swap(int[] arr,int max,int last){
         int temp=arr[last];
         arr[last]=arr[max];
         arr[max]=temp;
    }
    public static void main(String[] args) {
      int[] arr={100000,1,5,-2,3,-443};
      selectionsort(arr);
    }
}

// successful run for the all test cases  
