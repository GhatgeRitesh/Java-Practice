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

    public static boolean isPalindrome(ListNode list)
    {
        if(list == null )
        {
            System.out.println("list is empty");
            return false;
        }
        // creating the pointers to start and end nodes
        ListNode start=head;
        ListNode end=head;

        // traversing the end node to the


        return true;
    }

    //------------------------------------------------------------------
    public static void main(String[] args) {
        ListNode list=new ListNode(1);
        list.next=new ListNode(2);
        list.next.next=new ListNode(3);
        list.next.next.next=new ListNode(2);
        list.next.next.next.next=new ListNode(1);

        boolean result=isPalindrome(list);
        System.out.println(result);
    }
}
