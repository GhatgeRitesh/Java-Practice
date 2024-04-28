package Datastructure.LinkedList;

public class FindNodeByValue {
    // code to find node by its value
    static ListNode head;
    static class ListNode{
        int val;
        ListNode next;

        ListNode(int data)
        {
            val=data;
            next=null;
        }
    }
    public static void findNode(int data,ListNode list){
        head=list;
        while(head.val!=data)
        {
            System.out.println(head.val);
            head=head.next;
        }
        System.out.println("the Node for the value is :"+head);

       // ListNode@5f184fc6
    }
    public static void main(String[] args){
        ListNode list=new ListNode(1);
        list.next=new ListNode(2);
        list.next.next=new ListNode(3);
        list.next.next.next=new ListNode(4);
        list.next.next.next.next=new ListNode(5);

        findNode(5,list);
    }
}
