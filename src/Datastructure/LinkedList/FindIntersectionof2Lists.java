package Datastructure.LinkedList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindIntersectionof2Lists {

    // code to find the intersection of two linked list if present

    ListNode head;

    static class ListNode{
        ListNode next;
        int val;

        ListNode(int x)
        {
            this.val=x;
            this.next=null;
        }
    }
    //---------------------------------this method give the tc,sc O(n+M) for both worst performance---------------------
    static ListNode getintersectionnode(ListNode headA,ListNode headB)
    {
        ArrayList<ListNode>arr1=new ArrayList<>();
        ArrayList<ListNode>arr2=new ArrayList<>();

        //while adding elements we have the method to get the size simple
        while(headA!=null)
        {
            arr1.add(headA);
            headA=headA.next;
        }
        while(headB!=null)
        {
            arr2.add(headB);
            headB=headB.next;
        }

        //now working on loop for the minimum length of the list
        for(int i=0;i<Math.min(arr1.size(),arr2.size());i++)
        {
            if(arr1.size()>arr2.size())
            {
                if(arr1.contains(arr2.get(i)))
                {
                    return arr1.get(i);
                }
            }
            else
            {
                if(arr2.contains(arr1.get(i)))
                {
                    return arr1.get(i);
                }
            }
        }
        return null;
    }
//----------------------------------------------------------------------------------------------------------------------

    // with less tc of O(log n+M)  and Space O(n+m)
static ListNode getIntersectionNode(ListNode headA,ListNode headB) {
    Set<ListNode> setA = new HashSet<>();
    Set<ListNode> setB = new HashSet<>();

    //add the complete one list
    while (headA != null) {
      setA.add(headA);
      headA=headA.next;
    }
    //now while adding the second list you can check if the similare Node is present or Not in second set
    while(headB!=null)
    {
        if(setA.contains(headB)) return headB;
        setB.add(headB);
        headB=headB.next;
    }
    return null;
}

//-----------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        ListNode list1=new ListNode(1);
        list1.next=new ListNode(2);
        list1.next.next=new ListNode(3);
        list1.next.next.next=new ListNode(4);
    }

}
