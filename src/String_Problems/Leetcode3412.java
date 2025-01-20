package String_Problems;

import java.util.*;

public class Leetcode3412 {

    public static void main(String[] args) {
        String s= "zadavyayobbgqsexaabk";
        System.out.println("The String is "+ s);
        System.out.println(MirrorScore(s));
//        char ch=('a' + 'z') - 'b';
//        System.out.println("This is Mirror of b :" + ch );
    }
    public static long MirrorScore(String s){
        int n = s.length();
        long res = 0;

        // Map to track lists of unmarked indices for each character
        Map<Character, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char ch1 = s.charAt(i);
            char ch2 = (char) ('a' + ('z' - ch1)); // Mirror character

            if (map.containsKey(ch2) && !map.get(ch2).isEmpty()) {
                // Match found: take the closest unmarked index for the mirror character
                int j = map.get(ch2).remove(map.get(ch2).size() - 1);
                res += i - j;
            } else {
                // No match: store the current index for ch1
                map.putIfAbsent(ch1, new ArrayList<>());
                map.get(ch1).add(i);
            }
        }

        return res;
    }
}
