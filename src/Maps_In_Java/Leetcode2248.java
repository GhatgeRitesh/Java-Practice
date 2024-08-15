package Maps_In_Java;

import java.util.ArrayList;
import java.util.List;

public class Leetcode2248 {
    public static void main(String[] args) {

    }
    public List<Integer> intersection(int[][] nums) {
        var numbers=new int[1001];
        var size=nums.length;
        //count all
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                numbers[nums[i][j]]++;
            }
        }
        //iteradde array
        //if count ==size => add to a list
        var list=new ArrayList<Integer>();
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==size) list.add(i);
        }
        return list;
    }
}
