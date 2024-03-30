package Maps_In_Java;

import java.util.*;


public class Anagram_String {
    //program to get the Anagram Grouping: Given a list of strings, group anagrams together using a HashMap. Two strings are considered anagrams if they contain the same characters in a different order.
    
    //step 1 = Creating the key for the maps that are sorted array of the characters
    //step 2=making the array of charater string to store the key for map
    //step 3 = compare the key with the anagrams and store it in the list present as value in map
    
    public static void main(String[] args) {
         List<String> words = Arrays.asList("listen", "silent", "enlist", "hello", "world", "act", "cat", "tac");
         
         //creating the map to store the groups of anagrams
         Map<String,List<String>> map=new HashMap<>();

         //creating the key as char array sorted
         for(String word:words)
         {
            char[] chars=word.toCharArray(); 
            Arrays.sort(chars);  // sorting chars as per alphabeticals
            String sortedWord=new String(chars);  // making the array into the string

            // adding the words into the anagram group in map
            List<String>group=map.getOrDefault(sortedWord,new ArrayList<>());
            group.add(word);
            map.put(sortedWord,group);
            System.out.println(word);
         }

         for (List<String> group : map.values()) {
            System.out.println(group);
        }
    }
}
