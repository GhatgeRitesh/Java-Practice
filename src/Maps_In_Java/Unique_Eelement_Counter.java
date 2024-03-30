package Maps_In_Java;

import java.util.*;

public class Unique_Eelement_Counter {
    // Unique Elements Counter: Given an array of integers, 
    //count the frequency of each unique element using a HashMap.
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,2,1,3,5,3,6};

        Map<Integer,Integer>map=new HashMap<>();
        
        for(int i:arr)
        {
         map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer>p:map.entrySet())
        System.out.println(p.getKey()+":"+p.getValue());
    }
}
