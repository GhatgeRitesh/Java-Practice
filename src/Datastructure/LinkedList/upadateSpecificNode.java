package Datastructure.LinkedList;

public class upadateSpecificNode {
    //code to update the value of specfic node
    static ListNode head;
    static class ListNode{
        ListNode next;
        int val;
        ListNode(int data){
            val=data;
            next=null;
        }

    }

    public static void change(int prev,int after,ListNode list)
    {
        head=list;
        while(head.val!=prev)
        {
            //System.out.println(head.val);
            head=head.next;
        }
        head.val=after;
        while(list!=null)
        {
            System.out.println(list.val);
            list=list.next;
        }
    }
    public static void main(String[] args) {
        ListNode list=new ListNode(1);
        list.next=new ListNode(2);
        list.next.next=new ListNode(3);
        list.next.next.next=new ListNode(4);
        list.next.next.next.next=new ListNode(5);

        change(4,6,list);
    }
}
