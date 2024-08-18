package Strivers_455.Step3_40.Arrays;

import java.util.HashMap;
import java.util.Map;

public class single_number {
    public static void main(String[] args) {
        int[] nums={2,1,2};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int k:nums){
            map.put(k,map.getOrDefault(k,0)+1);
        }
        for(Map.Entry<Integer,Integer>e:map.entrySet()){
            if(e.getValue()==1){
                System.out.println(e.getKey());
            }
        }
        int xor=0;
        //using bit manipulation
        for(int i=0;i<nums.length;i++){
            xor=xor ^ nums[i];
        }
        System.out.println( xor);
    }
}
