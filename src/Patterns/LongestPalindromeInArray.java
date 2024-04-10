package Patterns;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindromeInArray {
    // code to find the longest palindrome in an array
    static void getlongestpalindrome(String[] str)
    {
        Map<String,Integer> map=new HashMap<>();
        for(String str1:str){
            map.put(str1,str1.length());
        }
        for(Map.Entry<String,Integer>p:map.entrySet())
        {
            System.out.print(" "+p.getValue()+" "+p.getKey());
        }
    }

    public static void main(String[] args) {
        String[] str = {"level", "noon", "radar", "hello", "world"};
        getlongestpalindrome(str);
    }
}
