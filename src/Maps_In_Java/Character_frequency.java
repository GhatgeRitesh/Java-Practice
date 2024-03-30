package Maps_In_Java;

import java.util.*;
public class Character_frequency {
    // code to count the frequency of the each characters from given string 
    public static void main(String[] args) {
        String str="Hi my name is Ritesh";

        Map<Character,Integer> map=new HashMap<>();

        for(char i:str.toCharArray())
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(Map.Entry<Character,Integer>entry:map.entrySet())
        {
            System.out.print(entry.getKey()+" : "+entry.getValue()+"\t");
        }
    }
}
