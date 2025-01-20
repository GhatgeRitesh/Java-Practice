package Sorting;

import java.util.ArrayList;
import java.util.List;

public class LeetCodePractice {
    public static void main(String[] args) {
        int[] nums= {1,2,3};

        System.out.println(minMaxSums(nums, 2));
    }
    public static int minMaxSums(int[] nums,int k){
//        List<List<Integer>> list= new ArrayList<>();
//        for(int start =0; start<nums.length;start++){
//            List<Integer> currsub= new ArrayList<>();
//            for(int end=start;end<nums.length && end<start+k;end++){
//                currsub.add(nums[end]);
//                list.add(new ArrayList<>(currsub));
//            }
//        }
//        System.out.println(list.toString());
//        int result=0;
//        for(int i=0;i<list.size();i++){
//            int min=Integer.MAX_VALUE;
//            int max=Integer.MIN_VALUE;
//            for(int j=0;j<list.get(i).size();j++){
//                min=Math.min(list.get(i).get(j),min);
//                max=Math.max(list.get(i).get(j),max);
//            }
//            System.out.println("max"+max+" :  min"+min);
//            result=min+max;
//        }
//        System.out.println(result);
//        return result;
        List<List<Integer>> list = new ArrayList<>();

        // Generate all subarrays of size at most k
        for (int start = 0; start < nums.length; start++) {
            List<Integer> currsub = new ArrayList<>();
            for (int end = start; end < nums.length && end < start + k; end++) {
                currsub.add(nums[end]);
                list.add(new ArrayList<>(currsub));
            }
        }

        System.out.println("Subarrays: " + list.toString());

        int result = 0;
        // Calculate sum of min and max for each subarray
        for (List<Integer> subarray : list) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int num : subarray) {
                min = Math.min(min, num);
                max = Math.max(max, num);
            }
            System.out.println("Subarray: " + subarray + ", Min: " + min + ", Max: " + max + ", Sum: " + (min + max));
            result += (min + max); // Add to the result
        }

        System.out.println("Final Result: " + result);
        return result;
    }
}
