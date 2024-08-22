package Strivers_455.LinikedList;

public class Impl_all {
     static Node head;
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data =data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        Node newnode=new Node(10);
        newnode.next=new Node(11);
        newnode.next.next=new Node(12);
        Node head=newnode;
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

}

