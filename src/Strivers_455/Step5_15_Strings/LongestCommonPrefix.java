package Strivers_455.Step5_15_Strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs={"flower","flow","flight"};
        if (strs == null || strs.length == 0)
        {
            System.out.println(" ");
            return;
        }
        Arrays.sort(strs);
        String s1=strs[0];
        String s2=strs[strs.length-1];
        int index=0;
        int count;
        while(index <s1.length() && index <s2.length()){
            if(s1.charAt(index) ==s2.charAt(index)){
                index++;
            }
            else{
                break;
            }
        }
        System.out.println( s1.substring(0,index) );
    }
}
