package Datastructure.LinkedList;

public class SwapNodes {
    // problem to swap nodes without swapping their data

    //Declaring Nodes
   static  ListNode head;

    public static class ListNode{
        ListNode next;
        int val;
        ListNode(int data){
            this.val=data;
            this.next=null;
        }
    }

    public static ListNode swapNode(ListNode head,int x,int y){
        //method accepts the two variables with the value of swapping Nodes

        if(x==y || head==null) // if the values of both the node is same no need to swap
        {
            return head;
        }

        //tracing the prev nodes of both swapping node
        ListNode prevx=null,currx=head;//Pointers currx is the tracer Node as Node1 and Node2
        ListNode prevy=null,curry=head;// pointers

        //finding the Nodes
        while(currx!=null && currx.val!=x)
        {
            prevx=currx;
            currx=currx.next;
        }
        while(curry!=null && currx.val!=y)
        {
            prevy=curry;
            curry=curry.next;
        }

        //if x and y or both not found return the head of the linked list
        if(currx==null || curry==null)
        {
            return head;
        }

        //if x is not head update the next pointer od prevx
        if(prevx!=null)
        {
            prevx=curry.next;
        }
        else
        {
            head =curry;
        }

        //if y is not head update the next pointer of prevy
        if(prevy!=null)
        {
            prevy=currx.next;
        }
        else
        {
            prevy=currx;
        }

        //swap the next pointers of x and y
        ListNode temp=currx.next;
        currx.next=curry.next;
        curry.next=temp;
       return head;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);

        ListNode head1=swapNode(head,2,4);

        while(head1!=null)
        {
            System.out.print(" "+head1.val);
            head1=head1.next;
        }
    }
}
