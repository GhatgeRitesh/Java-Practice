package Strivers_455.Step3_40.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={3,2,4};
        int tar=6;
        System.out.println(twosum(arr,tar));
        System.out.println(Arrays.toString(Twosum(arr,14)));
    }
    public static String twosum(int[] arr,int tar){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int need=tar-arr[i];
            if(map.containsKey(need)){
                return "Yes";
            }
            map.put(arr[i],i);
        }
        return "NO";
    }
    //using two pointer
    public static int[] Twosum(int[] arr,int tar){
        Arrays.sort(arr);
        int s=0; int e= arr.length-1;
        int[] res=new int[2];
        int n=arr[e];
        while(s<e){
            if(arr[s]+arr[e]==tar){
                res[0]=s;
                res[1]=e;
            }
            if(arr[s]+arr[e]<tar){
                s++;
            }
            else{
              e--;
            }
        }
        return res;
    }
}
