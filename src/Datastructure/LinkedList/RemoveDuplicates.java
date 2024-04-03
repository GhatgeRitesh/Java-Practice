package Datastructure.LinkedList;

import java.util.LinkedList;

public class RemoveDuplicates {

    //code to remove the duplicates from the linked list
    //assuming there is sorted Linked list  present

   static Node head;
    
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
    public static void insert(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            
            head=newNode;
            return;
        }

        // for travesing into  always create new object/Node
         Node currNode=head;
        while(currNode.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next=newNode; //adding the last node address of the newNode

    }

    static void display()
    {
        System.out.println(" ");
        Node ptr=head;

        while(ptr!=null)
        {
            System.out.print(ptr.data);
            ptr=ptr.next;
        }
    }
    static void removeDuplicates()
    {
      Node ptr1=head;
      Node ptr2=head.next;
      while(ptr1.next.next!=null)
      {
          if(ptr1.data==ptr2.data)
          {
              ptr1.next=ptr2.next;
          }
          ptr2=ptr2.next;
          ptr1=ptr1.next;
      }
    }

    public static void main(String[] args) {
        

        insert(1);
        insert(2);
        insert(2);
        insert(3);
        insert(4);
        insert(5);
        insert(5);

        display();
        removeDuplicates();
        display();
    }


}
