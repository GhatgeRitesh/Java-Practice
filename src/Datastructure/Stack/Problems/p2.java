package Datastructure.Stack.Problems;

import java.util.Stack;

public class p2 {
    // code to reverse the stack

    static void reverseStack(Stack<Integer> s)
    {
        if(s.isEmpty())
            return;
       int top=s.pop();
       reverseStack(s);
       pushAtBottom(s,top);
    }

    static void pushAtBottom(Stack<Integer> s,int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
       int top=s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);

        System.out.println(s.toString());
        reverseStack(s);

        System.out.println(s.toString());
    }

}
