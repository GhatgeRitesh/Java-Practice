package AComponentPractice;

import java.util.ArrayList;

public class countspecialchars_leetcode3120 {

    public static void main(String[] args) {
        String word="abacbs";
        ArrayList<Character> list=new ArrayList<>();
        ArrayList<Character> list1=new ArrayList<>();
        for(char c:word.toCharArray()){
            if(c<='Z' && c>='A'){
                if(!list.contains(c)){list.add(c);}
            }
        }
        int count=0;
        for(char c:word.toCharArray()){
            if(Character.toLowerCase(c)<='z' && Character.toLowerCase(c)>='a'){
                if(list.contains(Character.toUpperCase(c)) && !list1.contains(c)){
                    list1.add(Character.toUpperCase(c));
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
