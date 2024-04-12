package Datastructure.Stack.Problems;

import java.util.Scanner;
import java.util.Stack;

public class CreateSmallestNumberAfterRemovingKelements {
    // code to dervive the smallest number from given number after removing k elements
    public static String getnumber(String num,int k)
    {
        Stack<Character> s=new Stack<>();
        for(char c:num.toCharArray())
        {
            while(!s.isEmpty() && k>0 && s.peek()>c)
            {
                s.pop();
                k--;
            }
            s.push(c);
        }
        while(k>0 && !s.isEmpty())
        {
            s.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        while(!s.isEmpty())
        {
            sb.append(s.pop());
        }
        sb.reverse();
        while(sb.length()>0 && sb.charAt(0)=='0')
        {
            sb.deleteCharAt(0);
        }
        return sb.length()>0 ? sb.toString() : "0"   ;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        String number=sc.nextLine();
        System.out.println("enter the elements to be removed");
        int k=sc.nextInt();
        System.out.println(getnumber(number,k));
    }
}
