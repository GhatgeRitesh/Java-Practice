package Recursion;

import java.util.Arrays;

public class MergeSOrt {
    // code to learn the implementation of merge sort using recursion
    public static void main(String[] args) {
        int[] arr={1,7,3,6,89,2,66,78};
       System.out.println(Arrays.toString(divide(arr)) +" <--- array");
    }
    // method to divide the array into small subproblems
    public static int[] divide(int[] arr)
    {
      if(arr.length==1)
      {
          return arr ;
      }
      int mid=arr.length/2;
      int[] left=divide(Arrays.copyOfRange(arr,0,mid));
      int[] right=divide(Arrays.copyOfRange(arr,mid,arr.length));

      return combine(left,right);

    }

    public static int[] combine(int[] left,int[] right)
    {
        int[] mix=new int[left.length+ right.length];
        int i=0; int j=0; int k=0;

        while(i<left.length && j<right.length)
        {
            if(left[i]<right[j])
            {
                mix[k]=left[i];
                i++;
            }
            else
            {
                mix[k]=right[j];
                j++;
            }
            k++;
        }

        // while it might be the case where length of one of them be smaller than other
        while(i<left.length)
        {
            mix[k]=left[i];
            k++;i++;
        }
        while(j<right.length)
        {
            mix[k]=right[j];
            j++;k++;
        }
        return mix;
    }


}
