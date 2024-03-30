package collection_Framework.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class arraylist {
    // program to use the array list
    // basic have been learned and forwarding to the aadvanced

    public static void main(String[] args) {
        ArrayList<List<Integer>> list=new ArrayList<>();

        List<Integer> list1=new ArrayList<>(List.of(1,2,3,4,5));
        list.add(0,list1);
        list.add(1,list1);

        System.out.println(list.toString());
    }

}
