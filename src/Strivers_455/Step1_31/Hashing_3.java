package Strivers_455.Step1_31;

import java.util.HashMap;
import java.util.Map;

public class Hashing_3 {
    // code to find the highest and lowest frequency elements // finding the element with map need to iterate again or use the java steam

    public static void main(String[] args) {
        int[] arr={1,2,1,2,4,4,5,4,2,1,1,1,1,3};
        System.out.println("Finding the lowest and highest frequncy element " );
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int lowest=map.get(arr[0]);
        int highest=map.get(arr[0]);
        for(int value:map.values()){
            if(value<lowest){
                lowest=value;
            }
            else if(value>highest){
                highest=value;
            }
        }
        System.out.println("the lowest frequency element in map is "+lowest+" highest:"+highest);
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()==lowest){
                System.out.print(e.getKey() +":lowest ");
            }
            if(e.getValue()==highest) {
                System.out.print(e.getKey()+":highest ");
            }
        }

    }
}
