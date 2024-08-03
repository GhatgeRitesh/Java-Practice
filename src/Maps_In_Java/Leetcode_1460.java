package Maps_In_Java;

import java.util.Arrays;

public class Leetcode_1460 {
    // swap array to check it can match target array
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] target={2,4,1,3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(target);
        System.out.println(Arrays.toString(target));
        System.out.println(Arrays.equals(arr, target));

        // with maps just check it with the element frequencies if both array frequencies are same then it can be swapped then return true or else false

    }
}
