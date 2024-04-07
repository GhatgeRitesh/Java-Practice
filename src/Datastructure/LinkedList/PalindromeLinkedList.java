package Datastructure.LinkedList;

public class PalindromeLinkedList {
    // code to check is list  palindrome or not
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
    //------------------------------------------------------------------

    public static boolean isPalindrome(ListNode head)
    {
        if(head == null ||head.next== null)
        {
            System.out.println("list is empty");
            return false;
        }
       // spliting list into two havles
        ListNode slow=head;
        ListNode fast=head;

        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        // reverse the second half of the list
        ListNode second=reverse(slow.next);
        ListNode first=head;

        //traversing and checking the each Nodes
        while(second!=null)
        {
            if(second.val!=first.val)
            {
                return false;
            }
            first=first.next;
            second=second.next;
        }

        return true;
    }

    static ListNode reverse(ListNode second)
    {
        ListNode prev=null ;
        ListNode curr=second;

        while(curr!=null)
        {
            ListNode nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        return prev;

    }

    //------------------------------------------------------------------
    public static void main(String[] args) {
        ListNode list=new ListNode(1);
        list.next=new ListNode(2);
        list.next.next=new ListNode(3);
        list.next.next.next=new ListNode(2);
        list.next.next.next.next=new ListNode(2);

        boolean result=isPalindrome(list);
        System.out.println(result);
    }
}
/*
1. traverse the linked list and divide it into two halves
2. reverse the second half and again traverse lists while checking thier data
3. if reached end return true else false

 */