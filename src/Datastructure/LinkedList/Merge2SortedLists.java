package Datastructure.LinkedList;

public class Merge2SortedLists {

    // program to merge two sorted Linked list into single list


    public static class Node
    {
      Node next;
      int data;

      Node(int data)
      {
          this.data=data;
          this.next=null;
      }
    }

//---------------------------------------------method to merge----------------------------------------------------------

    public static void mergeLists(Node list1,Node list2)
    {
        // creating the new list to save the merger of two lists
        Node result=new Node(-1);
        Node curr=result;

        //logic to traverse and compare the lists
        while(list1!=null && list2!=null)
        {

            //comparing the each Node Value of both lists
            if(list1.data<=list2.data)
            {
                curr.next=list1;
                list1=list1.next;
            }
            else
            {
               curr.next=list2;
               list2=list2.next;
            }
            curr=curr.next;
        }

        // appending the remaining nodes of the non empty list
        if(list1!=null)
        {
          curr.next=list1;
        }
        if(list2!=null)
        {
            curr.next=list2;
        }
        result=result.next;

        //printing the list
        while(result!=null)
        {
            System.out.print(result.data+" ");
            result=result.next;
        }

    }

//-----------------------------------------------main method------------------------------------------------------------

    public static void main(String[] args) {

        //creating new two lists

        Node list1=new Node(1);
        list1.next=new Node(3);
        list1.next.next=new Node(6);

        Node list2=new Node(4);
        list2.next=new Node(9);
        list2.next.next=new Node(10);

        mergeLists(list1,list2);

    }

}
