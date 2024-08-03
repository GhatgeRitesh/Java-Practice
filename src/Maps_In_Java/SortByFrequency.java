package Maps_In_Java;

import java.util.*;

public class SortByFrequency {
    //program to sort the array by the increasing frequency of elements
    public static void main(String[] args) {
        int[] nums={-1,1,-6,4,5,-6,1,4,1};

        System.out.println(Arrays.toString(sortedarr(nums)));
    }
    public static int[] sortedarr(int[] nums){
        Map<Integer, Integer> map=new HashMap<Integer, Integer>();
        for (int j : nums) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        System.out.println(map.toString());
        List<Integer> list=new ArrayList<Integer>(map.keySet());
        list.sort((a,b)->{if(map.get(a).equals(map.get(b)))
        {
            return b-a;
        }
        return map.get(a) - map.get(b);
        });
        list.sort((a, b) -> {
            if (Objects.equals(map.get(a), map.get(b))) {
                return b - a;
            } else {
                return map.get(a) - map.get(b);
            }
        });
        System.out.println(list.toString());
        int[] result=new int[nums.length];
        int index=0;
        for(int num:list){
            for(int i=0;i<map.get(num);i++){
                result[index++]=num;
            }
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}
