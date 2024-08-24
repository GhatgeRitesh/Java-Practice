package AComponentPractice;

public class PrefixSumSuffixSum {
    // Kadane's Algorithm
    // program to learn prefix and suffix sum
    public static void main(String[] args) {
        int[] arr={1,2,3};
        subarrays(arr);
    }
    public static void subarrays(int[] arr){
        int i=0;
        int j=0;
        while(i<arr.length){
            while(j<arr.length){
                for(int k=i;k<=j;k++){
                    System.out.print(" "+arr[k]);
                }
                j++;
                System.out.println();
            }
            
        }
    }
}
