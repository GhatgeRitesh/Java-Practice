package Strivers_455.Step5_15_Strings;

import java.util.Arrays;
import java.util.Collections;

public class ReverseWords_PalindromeCheck {
    // program to reverse the string with correct words
    public static void main(String[] args) {
        String name ="MyName is Ritesh";
        System.out.println(name);
        System.out.println("after reversing String ");
        StringBuilder sb=new StringBuilder();
        String[] arr=name.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]);
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}
