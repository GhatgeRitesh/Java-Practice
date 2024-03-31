package Datastructure.Stack;

public class impl {
    //implementing  the stack ds can be done by arraylist or Linked list
    // LinkedList is easy

//********************************************Declaring Linked List*****************************************************
    static class Node
    {
      Node next;

      int data;

      Node(int data)
      {
       this.data=data;
       this.next=null;
      }
    }
//---------------------------------------------Declaring Stack DS ------------------------------------------------------
    static class Stack
    {
        public static Node head;

        public static Boolean isEmpty()
        {
          return head==null;
        }

        public static void push(int data)
        {
            Node newNode=new Node(data);
            if(isEmpty())
            {
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

        public static int pop() //deleting first Node of the stack
        {
            if(isEmpty())
            {
                System.out.println("List is empty");
                return 0;
            }
            int top=head.data;
            head=head.next;
            return top;
        }

        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("List is empty");
                return 0;
            }
            return head.data;
        }
    }
//-----------------------------------------------------main method------------------------------------------------------
        public static void main(String[] arg)
        {
              Stack s=new Stack();
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
