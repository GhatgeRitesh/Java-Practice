package Datastructure.LinkedList;

import javax.crypto.spec.PSource;

public class IMPL_CLL {

    //code to implement circular Linked list

//---------------------------------------defining structure ------------------------------
    static  ListNode head;

    static class ListNode{
        ListNode next;
        int val;
        ListNode(int data)
        {
            this.val=data;
            this.next=null;
        }
    }

//-----------------------------------------------------------------------------------

    // method to insert at end of ll
   public static void insertAtEnd(int data)
    {
        ListNode newNode=new ListNode(data);
        if(head==null)
          {
           head=newNode;
           head.next=head;
            return;
          }
        ListNode curr =head;
        while(curr.next!=null)
        {
         curr=curr.next;
        }
        curr.next=newNode;
        newNode.next=head;
    }
    public static void insertAtStart(int data){
        ListNode newNode=new ListNode(data);
        if(head==null)
        {
            head=newNode;
            head.next=head;
            return;
        }
        ListNode curr=head;
        while(curr.next!=head)
        {
            curr=curr.next;
        }
        newNode.next=head;
        head=newNode;
        curr.next=head;
    }
    public static void display()
    {
        if(head==null)
        {
            System.out.println("List is Empty");
            return;
        }
        ListNode curr=head;
        while(curr.next!=head)
        {
            System.out.print(curr.val+" ");
        }
    }
    // deleting the Node methods are
    public static void deleteLast()
    {
        if(head==null)
        {
            System.out.println("List Is Empty");
            return;
        }
        ListNode curr=head;
        while(curr.next.next!=head)
        {
            curr=curr.next;
        }
        curr.next=head;
    }
    public static void deleteAtStart()
    {
        if(head==null)
        {
            System.out.println("List is Empty");
            return ;
        }
        ListNode curr=head;
        while(curr.next!=head)
        {
            curr=curr.next;
        }
        head=head.next;
        curr.next=head;
    }
    // update and insert methods for latter

}
