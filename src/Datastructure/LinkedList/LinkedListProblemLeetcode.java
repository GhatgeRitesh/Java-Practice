package Datastructure.LinkedList;

import java.util.ArrayList;
import java.util.Stack;

public class LinkedListProblemLeetcode {
    /*
    problem no.2487 medium linked list,stack, recursion , monotonic stack
You are given the head of a linked list.

Remove every node which has a node with a greater value anywhere to the right side of it.

Return the head of the modified linked list.



Example 1:


Input: head = [5,2,13,3,8]
Output: [13,8]
Explanation: The nodes that should be removed are 5, 2 and 3.
- Node 13 is to the right of node 5.
- Node 13 is to the right of node 2.
- Node 8 is to the right of node 3.
Example 2:

Input: head = [1,1,1,1]
Output: [1,1,1,1]
Explanation: Every node has value 1, so no nodes are removed.


Constraints:

The number of the nodes in the given list is in the range [1, 105].
1 <= Node.val <= 105*/
    ListNode head;

    public static class ListNode{
        ListNode next;
        int val;
        ListNode(int data)
        {
            val=data;
            next=null;
        }
    }

    public static void main(String[] args) {
         ListNode list=new ListNode(5);
         list.next=new ListNode(2);
         list.next.next=new ListNode(13);
         list.next.next.next=new ListNode(3);
         list.next.next.next.next=new ListNode(8);
         list.next.next.next.next.next=new ListNode( 2);

         removeNode(list);

    }

    public static ListNode removeNode(ListNode list)
    {
        Stack<Integer> s=new Stack<>();
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode head=list;
        while(head!=null)
        {
            s.push(head.val);
            head=head.next;
        }
        int max=s.pop();
        int curr=max;
        while(!s.empty())
        {
            curr=s.pop();
            if(!(max<curr))
            {
                arr.add(curr);
            }
        }
        while(list!=null)
        {
            if(arr.contains(list.val))
            {
                
            }
        }
       return head;
    }

}
