package Strivers_455.Step3_1.Arrays;

import java.util.HashMap;
import java.util.Map;

public class FindUniqAndTwiceOccurance {
    // code to find the elements present in array for once and twice
    public static void main(String[] args) {
        int[] arr={1,2,3,2,3};
        //using the xor operation most Optimal
        System.out.println("XOR operation ");
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            ans=ans^arr[i];
        }
        System.out.println(ans);

        System.out.println("using map DataStructure");
        //using hashset tc=O(N*logM)+O(M) sc=O(M)
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int k:arr){
            map.put(k,map.getOrDefault(k,0)+1);
        }
        System.out.println(map.toString());
        //where the key is one print it.
        for(Map.Entry<Integer,Integer> k:map.entrySet()){
            if(k.getValue()==1){
                System.out.println(k.getKey());
                break;
            }
        }
    }
}
