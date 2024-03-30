package Maps_In_Java;

import java.util.*;
import java.util.HashMap;
import java.util.Map;
public class demo_map {
    // program to learn the maps in java
     
    // there are seven type of maps in java 
    //     HashMap
    //     TreeMap
    //     LinkedHashMap
    //     ConcurrentHashMap
    //     EnumMap
    //     WeakHashMap
    //     IdentityHashMap
    public static void main(String[] args) {
        // declaring map 
        Map<Integer,String> myMap=new HashMap<>();
    
        // for inserting values into the maps
        myMap.put(1,"Ritesh");
        
        // for retriving the values from maps by keys
        String value=myMap.get(1);
        System.out.println(value);

        //for removing the values from the map
        myMap.remove(1);//use key

        //for inserting the values into the map 
        String[] list={"Ritesh","Sandesh","Mummy"};
        for(int i=0;i<3;i++)
        {
            myMap.put(i,list[i]);
        }

        // for itterating into the maps
        for(Map.Entry<Integer,String> entry:myMap.entrySet())
        {
         int key=entry.getKey();
         String value1=entry.getValue();
         //System.out.println(myMap.toString());
         System.out.print("Key "+key+" value "+value1+"\t");
        }
    }
}
