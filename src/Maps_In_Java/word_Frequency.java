package Maps_In_Java;

import java.util.*;

public class word_Frequency{
    // code to find the frequency of each word in the given list of words 
    public static void main(String[] args) {
        
        // static inplementation for alocation of dynamic memory
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String,Integer> map=new HashMap<>();

        for(String word:words)
        {
            map.put(word,map.getOrDefault(word,0)+1);
        }

        for(Map.Entry<String,Integer> entry : map.entrySet())
        {
           System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}