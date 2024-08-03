package Strivers_455.Step3_40.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindUnion {
    //code to find the union of the two arrays
    //three approaches 1.Maps , 2.Sets , 3.Two pointers all will contain Arraylist to store result

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 6};
        int[] arr2 = {2, 3, 2, 4, 5};
        System.out.println("ArrayOne:" + Arrays.toString(arr1) + "\nArrayTwo:" + Arrays.toString(arr2));

        //Using maps
        Map<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int k:arr1){
            map.put(k,map.getOrDefault(k,0)+1);
        }
        for(int k:arr2){
            map.put(k,map.getOrDefault(k,0)+1);
        }
        list.addAll(map.keySet());
        System.out.println(list.toString());
    }
}

