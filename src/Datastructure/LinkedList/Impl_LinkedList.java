package Datastructure.LinkedList;

public class Impl_LinkedList {
    //code for the implementation for the Linked list

//-------------------------------------------declaring class variables--------------------------------------------------

    private int size;

    //constructor
    Impl_LinkedList()
    {
        this.size=0;
    }

//-------------------------------------------declaring Node Structure---------------------------------------------------
    //declaring the Head For the Node
    Node head;

    //creating the class for Node
    public class Node
    {
        //declaring the type of data is stored into the linked List
        String data;

        //declaring the class variable for the next field
        Node next;

        // delcaring the structure of the node
        Node(String data)
        {
           this.data=data;
           this.next=null;
        }
    }
 //------------------------------------------end of declaring the LinkedList Node---------------------------------------

 //--------------------------------------method to calculate the size of Linked List------------------------------------

 public void getSize()
 {
     System.out.println("Current Size of the Linked List is --> "+size);
 }

 //-----------------------------adding method to insert the data into list to the first place---------------------------

    public void insertAtStart(String data)
    {
        Node newnode=new Node(data); //creating the object for the newNode

        size++; //calculating size of the list

        //check if the list is empty or not
        if(head==null)     // checking for empty list
        {
            head=newnode;  // setting the headpointer to the newNode as it is first node now

            System.out.println("Node Added Successfully");

        }

        else
        {
            newnode.next=head; //giving the next field address of previous fisrt node
            head=newnode;      //adding head node to newnode

            System.out.println("Node Added Successfully");

        }
    }

 //--------------------------------------------------end of insert------------------------------------------------------
 //-------------------------------------method to insert the node at end of the list------------------------------------

    public void insertAtEnd(String data)
    {
        Node newNode=new Node(data);
        size++;
        if(head==null)
        {
            head=newNode;

            System.out.println("Node Added Successfully");
        }

        // for travesing into list always create new object/Node
        Node currNode=head;
        while(currNode.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next=newNode; //adding the last node address of the newNode

        System.out.println("Node Added Successfully");
    }

 //-------------------------------------------------end of end insert---------------------------------------------------
 //---------------------------------------method for displaying list elements-------------------------------------------

    public void display()
    {
        Node currNode=head;

        if(head==null)
        {
            System.out.println("List is Empty");
        }

        System.out.println("The Eelements of the LinkedList are :");

        while(currNode.next.next!=null)
        {
            System.out.print("  "+currNode.data);
        }
    }

 //------------------------------------------------end of display ------------------------------------------------------

//------------------------------------------method for deleting the first node------------------------------------------

    public void deleteFirst()
    {
       //check if list is Empty or Not
       if(head==null)
       {
           System.out.println("The list is already empty");
       }
       Node currNode=head;
       currNode=currNode.next;
       head=currNode;
       size--;
       System.out.println("Node Deleted Successfully");
    }

//------------------------------------------------end of delete first---------------------------------------------------
//-------------------------------------------method for delete last Node -----------------------------------------------
    public void deleteEnd()
    {
        if(head==null)
        {
            System.out.println("List is empty");
        }
        Node currNode=head;
        while(currNode.next.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next=null;
        size--;
        System.out.println("Deleted successfully");
    }
//------------------------------------------------end of delete last ---------------------------------------------------
//----------------------------------------update the List with the target Node -----------------------------------------

    public void updateNode(String newdata,String currdata)
    {
        if(head==null)
        {
            System.out.println("The List is Empty");
        }
        Node currNode=head;
        while(currNode.data!=currdata)
        {
            currNode=currNode.next;
        }
        currNode.data=newdata;

        System.out.println("Updated successfully");
    }

//----------------------------------------------end of update target Node-----------------------------------------------
//----------------------------------------------updating node with index------------------------------------------------

   public void updateWithIndex(String data,int index)
   {

   }

//-----------------------------------------------end of index value update----------------------------------------------

//-----------------------------------------------------main method------------------------------------------------------
   public static void main(String[] args)
    {
        // methods name in the program is
        /*
        *   1.InsertFirst  2.
        *
        * */

    }
}
