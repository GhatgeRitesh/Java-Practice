package String_Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LeetCode2053 {
     public static void main(String[] args) {
        String[] arr={"d","b","c","b","c","a"};
        int k=2;
         System.out.println(kthDistinct(arr,k));
     }
     public static  String kthDistinct(String[] arr, int k) {
            LinkedHashMap<String , Integer> map=new LinkedHashMap<>();
            for(String str: arr){
                map.put(str,map.getOrDefault(str,0)+1);
            }
            ArrayList<String> list= new ArrayList<>();
            for(Map.Entry<String,Integer> e:map.entrySet()){
                if(e.getValue() == 1){
                    list.add(e.getKey());
                }
            }
            System.out.println(map.toString());
         System.out.println(map.values());
            System.out.println(list.toString());
            if(list.size() < k){
                return "";
            }
            return list.get(k-1);
     }
}
//import java.util.HashMap;
//import java.util.Map;
//
//class Solution {
//    public String kthDistinct(String[] arr, int k) {
//        Map<String, Integer> countMap = new HashMap<>();
//
//        // Count occurrences of each string
//        for (String s : arr) {
//            countMap.put(s, countMap.getOrDefault(s, 0) + 1);
//        }
//
//        // Identify distinct strings in order and find the kth distinct
//        int distinctCount = 0;
//        for (String s : arr) {
//            if (countMap.get(s) == 1) {
//                distinctCount++;
//                if (distinctCount == k) {
//                    return s;
//                }
//            }
//        }
//
//        // If there are fewer than k distinct strings, return an empty string
//        return "";
//    }
//}

