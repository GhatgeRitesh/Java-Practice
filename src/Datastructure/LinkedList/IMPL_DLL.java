package Datastructure.LinkedList;

public class IMPL_DLL {
    // code to implement the doubly linked list

 //-------------------------------defining structure of the DLL --------------------------------------------------------

    static ListNode head;
    static ListNode tail;

    public static class ListNode {
        ListNode prev=null;
        ListNode next=null;
        int val;

        ListNode(int data)
        {
            this.val=data;
            this.prev=null;
            this.next=null;
        }
    }
  //----------------------------------adding methods ------------------------------------------------------------------
    static void insert(int data)
    {
        ListNode newNode=new ListNode(data);
        if(head==null)
        {
            head=newNode;
            return ;
        }

        ListNode curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        newNode.prev=curr;
        curr.next=newNode;
        tail=newNode;
    }

    static void insertAtStart(int data){
        ListNode newNode=new ListNode(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    static void insertAtIndex(int index,int data){

    }

    static void  display()
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return ;
        }
        ListNode curr=head;
        while(curr!=null)
        {
            System.out.print(curr.val+" ");
            curr=curr.next;
        }
        // alternative way to display the linked list with .toString() method for ListNode class

    }
    static void deleteAtEnd()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        ListNode curr=head;
        while(curr.next.next!=null)
        {
            curr=curr.next;
        }
        curr.next=null;
        tail=curr;
    }
    static void deleteAtStart(){
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        head=head.next;
        head.prev=null;
    }

}
