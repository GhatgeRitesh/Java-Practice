package Datastructure.Stack.Problems;

import java.util.Arrays;
import java.util.Stack;

public class ReverseString {
    // code to reverse given string using stack data structure

    static void reverseString(String str)
    {
        Stack<Character>s=new Stack<>();
        for(char c:str.toCharArray())
        {
            s.push(c);
        }

       //inbuilt method
        System.out.println(s.reversed().toString() +" by inbuilt method");

       // by string builder
       StringBuilder sb=new StringBuilder();
       while(!s.isEmpty())
       {
           sb.append(s.pop());
       }
        System.out.println(Arrays.toString(sb.toString().toCharArray()) +" by sb method");
    }

    public static void main(String[] args) {
        Stack<Character> s=new Stack<>();
        String Name="Ritesh";
        System.out.println(Arrays.toString(Name.toCharArray()) +" String");
        reverseString(Name);
    }

}
