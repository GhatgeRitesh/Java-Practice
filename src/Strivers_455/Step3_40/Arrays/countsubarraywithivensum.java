package Strivers_455.Step3_40.Arrays;

import java.util.HashMap;

public class countsubarraywithivensum {
    public static void main(String[] args) {
        int nums[]={3,2,4,1};
        HashMap<Integer,Integer>map=new HashMap<>();
        int k=6;
        int sum=0;
        int cnt=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)){
             cnt+=map.get(sum-k);
            }
        }
        System.out.println(cnt);
    }
}
