package Strivers_455.Step3_1.Arrays;

public class MaxConsecutiveOnes {
    // program to find no.of consecutive ones in an array
    //O(N)tc and O(1) sc
    //using max counter
    public static void main(String[] args) {
        int[] arr={1,1,0,0,1,0,1,1,1,0,1};
        int count=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }
            else{
                count=0;
            }
            max=Math.max(max,count);
        }
        System.out.println(max);
    }
}
