package Datastructure.Stack;

import java.util.ArrayList;

public class impl_ArrayList {
    //code to implement stack using arraylist
//--------------------------------------defining stack structure and methods--------------------------------------------

    static class Stack
    {
       static ArrayList<Integer> list=new ArrayList<>();

       public static Boolean isEmpty()
       {
           return list.isEmpty();
       }
        static void push(int data)
        {
            list.add(data);
        }
        static int pop()
        {
            if(isEmpty())
            {
                return -1;
            }
            int top=list.getLast();
            list.removeLast();
            return top;
        }

        static int peek()
        {
            return list.getLast();
        }

    }

//--------------------------------------------------main method---------------------------------------------------------
        public static void main(String[] args)
        {
            impl.Stack s=new impl.Stack();
            s.push(5);
            s.push(4);
            s.push(3);
            s.push(2);
            s.push(1);
            s.push(0);

            while(!s.isEmpty())
            {
                System.out.println(s.peek());
                s.pop();
            }
        }
}
