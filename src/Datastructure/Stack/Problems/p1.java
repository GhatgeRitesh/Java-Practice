package Datastructure.Stack.Problems;

import java.util.Stack;

public class p1 {
    // code to push to the bottom of stack

    //using the implicit recursion

//--------------------------------------------method pushAtBottom ----------------------------------------------------------------
    public static void pushAtBottom(int data,Stack<Integer> s)
    {
        System.out.println("process"+s.toString());
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(data,s);
        s.push(top);

        System.out.println("the stack"+s.toString());
    }

//------------------------------------------------main method ----------------------------------------------------------
        public static void main(String[] args)
        {
           Stack<Integer> s=new Stack<>();
           s.push(1);
           s.push(2);
           s.push(3);
           s.push(4);

            System.out.println("before"+s.toString());
           pushAtBottom(5,s);

        }

}
