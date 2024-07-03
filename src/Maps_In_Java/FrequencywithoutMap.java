package Maps_In_Java;

import java.util.*;

public class FrequencywithoutMap {
    // program to count the frequencies of array elements
    public static void main(String[] args) {
        int[] arr={1,2,1,2,3,4,5,3,6,7,8,4,6,10,10,3,5};
        int max=0;
        for(int num:arr){
            if(num>max)
            {
                max=num;
            }
        }
        int[]fre=new int[max+1];
        for(int num:arr)
        {
            fre[num]++;
        }
        System.out.println("the Frequency with regular counter");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(fre));
        for(int i=0;i<fre.length;i++)
        {
            if(fre[i]>0)
            {
                System.out.print(i+"="+fre[i]+" ");
            }
        }
        System.out.println(" ");
        System.out.println("Frequency with HashMap");
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        System.out.println(map.toString());

        // to find the intersections of array
        //creating second array
        int[] arr2={9,8,7,6,5,4,4,3,2,4,6,2,1,10,3,2,5};
    }

}
