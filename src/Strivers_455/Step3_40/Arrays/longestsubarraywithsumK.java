package Strivers_455.Step3_40.Arrays;

import java.util.HashMap;

public class longestsubarraywithsumK {
    // program to find the longest subarray with sum [positive & Negative]
    public static void main(String[] args) {
        int[]  arr={1,4 ,3 ,3 ,5, 5};
        int k=16;
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;int max=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==k){
                max=Math.max(max,i+1);
            }
            int rem=sum-k;
            if(map.containsKey(rem)){
                int len=i-map.get(rem);
                max=Math.max(max,len);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        System.out.println(max);
    }
}
