package Datastructure.LinkedList;

public class FIndKthNodeFromEnd {
    // code to find Kth node from end of the linked list

    // structure
   static ListNode head;

   static class ListNode{
       ListNode next;
       int val;

       ListNode(int data){
           this.val=data;
           this.next=null;
       }

       //method to get the size of the list
       public static int getsize()
       {
           int size=0;
           ListNode curr=head;
           while(curr.next!=null)
           {
               size++;
               curr=curr.next;
           }
           return size;
       }

       // getting kth  Node of the list
       public static ListNode getKthNode(int k,ListNode list){
           ListNode curr=head;
           int kth=getsize()-k;
           kth+=1;
           for(int i=0;i<k;i++)
           {
               curr=curr.next;
           }
         return curr;
       }
       // another way to solve this quetion is by two pointers
       static ListNode twopointer(ListNode list,int k)
       {
           ListNode slow=list;
           ListNode fast=list;
           while(k-->0)
           {
               fast=fast.next;
           }
           while(fast!=null && fast.next!=null)
           {
               slow=slow.next;
               fast=fast.next;
           }
           if(slow==null)
           {
               System.out.println("Node not found");
               return null;
           }
           return slow;
       }

       public static void main(String[] args) {
           // creating the
           ListNode list=new ListNode(1);
           list.next=new ListNode(2);
           list.next.next=new ListNode(3);
           list.next.next.next=new ListNode(4);
           head=list;
           ListNode node=getKthNode(2,list);
           System.out.println("result--> "+node.val);
           ListNode node2=twopointer(list,3);
           System.out.println("result1 --> "+node2.val);
       }
   }
}
