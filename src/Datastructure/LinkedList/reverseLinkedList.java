package Datastructure.LinkedList;

public class reverseLinkedList {
    // code to reverse the linked list
    // try to make it in recursive call -- is this possible
    // make it O(1) - O(n)  -- if possible?

    static ListNode head;
    static class ListNode{
        ListNode next;
        int val;
        ListNode(int data)
        {
            this.val=data;
            this.next=null;
        }
    }
    // reverse method
    static void reverse(ListNode list1)
    {
        // creating three pointers
        ListNode curr=list1;
        ListNode prev=null;
        ListNode next=null;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        head=prev;
        System.out.println(list1.val);
    }

    public static void main(String[] args) {
        ListNode list=new ListNode(1);
        list.next=new ListNode(2);
        list.next.next=new ListNode(3);
        list.next.next.next=new ListNode(4);
        reverse(list);
        while(head!=null)
        {
            System.out.print(head.val+" ");
            head=head.next;
        }
    }
}
