package Datastructure.LinkedList;
import java.util.*;
 // this is the scratch code for the linked list all the functions for list are present into the Java Collection FrameWork
public class linked_list{
    Node head;
    private int size; // initializing the size vaiable 
     linked_list(){
        this.size=0;
     }
     class Node{    
        String data;
        Node  next; // oop concept class variable 
        Node(String data)  // structure of the node 
        {
         this.data=data;
         this.next=null;
        }
     } 

     // adding the node at first index of the linked list 
     public void addFirst(String data)
     {
        Node newnode=new Node(data); // creation of the object for the node 
        if(head==null) // checking the list is  empty or not
        {
            head=newnode; // if eempty set head for newnode
            return;
        }
        newnode.next=head; // if not empty set next value of the newnode as the head
        head=newnode; // set head as the newnode
        System.out.println("Node Added Successfully AT First Index");
        size++;
     }

     // adding the node at the last index of the linked list
     public void addLast(String data)
     {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            return;
        }
        // create new Node object for traversing 
        Node currNode=head;  // never to manipulate the head it will cause complete cause for loosing linked list
        while(currNode.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next=newnode;
        System.out.println("Node Added Successfully At Last Index");
        size++;
     }

     // Accessing the linked list
     public void displayList()
     {
        
        if(head==null)
        {
            System.out.println("Linked list is empty ");
            return;
        }
        System.out.println("The Linked-List is as");
        System.out.println();
        // creating new Node Object
        Node currNode=head;
        while(currNode!=null)
        {
            System.out.print(currNode.data +" -> ");
            currNode=currNode.next;
        } 
        System.out.print("NULL");
        System.out.println();
      
     }

     //reversing list via itterative approach
     public void reverseI(){
        Node curreNode;
     }


     // updating the linked list  is not working
     public void updateList(String data,String tar)
     {
        Node newNode=new Node(data);
        Node crrNode=new Node(tar);
        if(head==null)
        {
            System.out.println("list is empty");
            return ;
        }
        while(crrNode.data!=tar)
        {
            crrNode=crrNode.next;
        }
        crrNode.data=newNode.data;
        System.out.println("Node is updated");
     }

    // Delete First Node
    public void delFirst()
    {
      if(head==null)
      {
        System.out.println("List is Empty");
        return;
      }
      size--;
      head=head.next;
      System.out.println("Node is deleted");
    }

    //Deleting last Node of the list 
    public void delLast()
    {
        if(head==null)
        {
            System.out.println("the List is Empty");
            return;
        }
        size--;
        if(head.next==null)  // this is the case for the Single node present
        {
            head=null;
            return;
        }
        Node last=head;
        Node second=head;
        while(last.next!=null)
        {
            second=last;
            last=last.next;
        }
        second.next=null;
        System.out.println("Last Node Deleted SuccessFully");
        System.out.println();
    }

    //Function foe getting the size of the List
    public int getSize(){
        return size;
    }

     public static void main(String[] args) {
        linked_list li =new linked_list();  // creating the new object for the class linked list
        li.addFirst("a"); // adding the new values or nodes into the linked list
        li.addFirst("is");
        li.displayList();
        li.updateList("was", "is");
        li.addLast("List");
        li.displayList();
    }
}
