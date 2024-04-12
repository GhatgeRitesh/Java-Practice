package Recursion;

public class IsSortedArray {
    //code to check the array is sorted or not
    static boolean checkSorted(int[] arr,int index)
    {
        if(index == arr.length-1)
        {
            return true;
        }
        return arr[index]<arr[index+1] && checkSorted(arr,index+1);
    }
    public static void main(String[] args) {
        int[] arr={1,3,5,7,12,46,212};
        System.out.println(checkSorted(arr,0));
    }
}
