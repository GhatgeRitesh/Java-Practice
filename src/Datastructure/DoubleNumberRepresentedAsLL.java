package Datastructure;

public class DoubleNumberRepresentedAsLL {
    // problem no 2816 leetcode

    /*You are given the head of a non-empty linked list representing a non-negative integer without leading zeroes.

Return the head of the linked list after doubling it.



Example 1:


Input: head = [1,8,9]
Output: [3,7,8]
Explanation: The figure above corresponds to the given linked list which represents the number 189. Hence, the returned linked list represents the number 189 * 2 = 378.
Example 2:


Input: head = [9,9,9]
Output: [1,9,9,8]
Explanation: The figure above corresponds to the given linked list which represents the number 999. Hence, the returned linked list reprersents the number 999 * 2 = 1998.


Constraints:

The number of nodes in the list is in the range [1, 104]
0 <= Node.val <= 9
The input is generated such that the list represents a number that does not have leading zeros, except the number 0 itself.*/


    public static class ListNode{
        ListNode next;
        int val;
        ListNode(){}
        ListNode(int data)
        {
            val=data;
            next=null;
        }
    }

    public static ListNode doubleNumber(ListNode head)
    {
        // create the extra node to handle carry
        ListNode head1= new ListNode();

        //join node to list
        head1.next=head;

        // creating new Pointers
        ListNode left=head1;
        ListNode right=head;

        int carry=0;

        // iterate and apply logic through list
        while(right.next!=null)
        {
            // increment carry value
           if((right.val*2)>=10)
           {
               left.val+=1;
           }
           right.val=(right.val*2)%10;
           left=left.next;
           right=right.next;
        }
        return head1.val > 0 ? head1 : head;
    }
    public static void main(String[] args) {
        ListNode list=new ListNode(1);
        list.next=new ListNode(8);
        list.next.next=new ListNode(9);

        ListNode list2=new ListNode(9);
        list2.next=new ListNode(9);
        list2.next.next=new ListNode(9);

        System.out.println("List 1 ");
        display(doubleNumber(list));

        System.out.println(" List 2");
        display(doubleNumber(list2));
        int num=100;
        System.out.println(String.valueOf(num).length());
        System.out.println((6*2)%10);
    }
   public static void display(ListNode node)
   {
       System.out.print( "[");
       while(node!=null)
       {
           System.out.print(node.val+ ",");
           node=node.next;
       }
       System.out.print("]");
       System.out.println(" ");
   }
}
