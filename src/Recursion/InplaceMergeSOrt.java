package Recursion;

public class InplaceMergeSOrt {
    // code to sort the array with merge sort in place

    public static void main(String[] args)
    {
        int arr[]={5,4,3,2,1};
        mergesort(arr,0,(0-arr.length/2),arr.length);
    }
    public static void mergesort(int arr[],int s,int m,int e)
    {
        if(s-e==1)
        {
            return;
        }
        m=(s-e)/2;

      //  mergesort(arr);
    }
}
