package Strivers_455.Step5_15_Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class checkTwoStringAreAnagramOfEachother {
    // return true or false for anagram strings
    // check the count of each character in both string is same or not
    public static void main(String[] args) {
        String a="act";
        String b="cat";
        String c="rules";
        String d="lesrt";

        System.out.println(checkAnagram(a,b)+" : Test 1 ");
        System.out.println(checkAnagram(c,d)+" : Test 2 ");
    }
    public static boolean checkAnagram(String s,String t){
//
//        HashMap<Character,Integer>map=new HashMap<>();
//        HashMap<Character,Integer>map1=new HashMap<>();
//        for(char c:a.toCharArray()){
//            map.put(c,map.getOrDefault(c,0)+1);
//        }
//        for(char c:b.toCharArray()){
//            map1.put(c,map1.getOrDefault(c,0)+1);
//        }
//        if(map.equals(map1)){
//            return true;
//        }
//        return false;
        char[] arr=new char[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i);
        }
        char[] arr1=new char[t.length()];
        for(int i=0;i<t.length();i++){
            arr1[i]=t.charAt(i);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        if(Arrays.equals(arr,arr1)) return true;
        return false;
    }
}
