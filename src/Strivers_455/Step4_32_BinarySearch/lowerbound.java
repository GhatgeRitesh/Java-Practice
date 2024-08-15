package Strivers_455.Step4_32_BinarySearch;

public class lowerbound {
    // problem to return the first index of target
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(lowerbound(arr,6));
    }
    public static int lowerbound(int[] arr,int x){

        // this part is not optimal but to make this optimal
        // make this binary search it makes itself optimal
        for(int i=0; i<arr.length;i++){
            if(arr[i]>=x) return i;
        }
        return arr.length;
    }
}
