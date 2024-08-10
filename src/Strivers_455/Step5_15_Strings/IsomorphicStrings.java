package Strivers_455.Step5_15_Strings;

import java.util.Arrays;
import java.util.HashMap;

public class IsomorphicStrings {
    //leetcode https://leetcode.com/problems/isomorphic-strings/
    public static void main(String[] args) {
      String a="add";
      String b="egg";
        System.out.println(isIsomorphic(a,b));
    }
    public static  boolean isIsomorphic(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map.values());
//        int[] arr=map.values().stream().mapToInt(Integer::intValue).toArray();
        HashMap<Character,Integer>map1=new HashMap<>();
        for(char c:t.toCharArray()){
            map1.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map1.values());
//        int[] arr1=map1.values().stream().mapToInt(Integer::intValue).toArray();
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr1);
//        System.out.println(Arrays.toString(arr1));
//        return Arrays.equals(arr,arr1);
        return true;

    }
}
