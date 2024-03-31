package Datastructure.LinkedList;

public class findMiddleElement {

    //code to find the middle element of  the linked list in single pass
    //using the two pointer approach
    // this algorithm give second middle element if elements are in even number
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
  //------------------------------------------------findind middle element-------------------------------------------//

    public static void findMiddle(Node list)
    {
        //creating two pointers

        Node slow=list;
        Node fast=list;

        if (list == null) {
            System.out.println("List is empty");
            return;
        }
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        System.out.println("The middle Element of the list is --> "+slow.data);
    }
 //-------------------------------------------------------------------------------------------------------------------//
    public static void main(String[] args) {
        Node list=new Node(1);
        list.next=new Node(2);
        list.next.next=new Node(3);
        list.next.next.next=new Node(4);
        list.next.next.next.next=new Node(5);
        list.next.next.next.next.next=new Node(6);

        findMiddle(list);
    }

}
