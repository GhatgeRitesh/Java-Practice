package Strivers_455.Step3_40.Arrays;

import java.util.Arrays;

public class MissingNumber {
    // program to find missing number for 1-N

    public static void main(String[] args) {
        int[] arr={1,3,4,5,6};
        int N=6;
        System.out.println(Arrays.toString(arr));
        //using linear search -- temporary approach
//        for(int i=0;i<arr.length;i++){
//            if((i+1)!=arr[i]){
//                System.out.println((i+1)+" :is missing");
//                return;
//            }
//        }

        //using hashing technique
        int[] hash=new int[N+1];
        for(int i=0;i<N-1;i++){
           hash[arr[i]]++;
        }
        for(int i=1;i<=N;i++){
            if(hash[i]==0){
                System.out.println(i+": is missing");
                break;
//                return;
            }
        }

        //using the sum operation
        int sum=(N*(N+1))/2;
        int s2=0;
        for(int i=0;i<N;i++){
            s2+=arr[i];
        }
        System.out.println(sum-s2+" :is missing number");

        //using xor
        int xor1 = 0, xor2 = 0;

        for (int i = 0; i<N ; i++) {
            xor2 = xor2 ^ arr[i]; // XOR of array elements
            xor1 = xor1 ^ (i + 1); //XOR up to [1...N-1]
        }
        xor1 = xor1 ^ N; //XOR up to [1...N]

        System.out.println(xor1 ^ xor2);
    }
}
