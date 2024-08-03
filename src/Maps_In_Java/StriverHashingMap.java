package Maps_In_Java;

import java.util.HashMap;
import java.util.Map;

public class StriverHashingMap {
    // program to use the maps for hashing
    public static void main(String[] args) {
        int[] arr={1,2,1,2,3,2,1};
        System.out.println("adding elements into map for frequency ");

        // preprocessing
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
            // map[a]++; this works in cpp
        }
        // traverse through map
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            System.out.print("{"+entry.getKey()+"="+entry.getValue()+"} ");
        }
        System.out.println("\n"+map.toString());

    }
}
