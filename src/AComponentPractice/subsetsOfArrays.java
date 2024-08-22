package AComponentPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class subsetsOfArrays {
    //program to generate the subsets of the array
    public static void main(String[] args) {
        int[] arr={1,2,3};
        ArrayList<ArrayList<Integer>>allsubsets=new ArrayList<>();
        allsubsets=getAllSubsets(arr);
        System.out.println(count(allsubsets,3));
        System.out.println(allsubsets.toString());
    }
    public static ArrayList<ArrayList<Integer>> getAllSubsets(int[] nums){
        ArrayList<ArrayList<Integer>>subsets=new ArrayList<>();
        int n = nums.length;
        int totalSubsets = 1 << n;
        for(int i=0;i<totalSubsets;i++){
            ArrayList<Integer>curr=new ArrayList<>();
            for(int j=0;j<n;j++) {
                if ((i & (1 << j)) != 0) {
                    curr.add(nums[j]);
                }

            }
            if(!subsets.contains(curr)) {
                subsets.add(curr);
            }
        }
        return subsets;
    }
    public static int count(ArrayList<ArrayList<Integer>> subsets, int k){
        int count=0;
        for(int i=0;i<subsets.size();i++){
            int sum=0;
            for(int j=0;j<subsets.get(i).size();j++){
                sum+=subsets.get(i).get(j);
            }

            if(sum==k){
                count++;
            }
        }
        return count;
    }
}
