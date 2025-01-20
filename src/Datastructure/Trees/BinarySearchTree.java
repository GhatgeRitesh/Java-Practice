package Datastructure.Trees;

class Node{
    Node right;
    int val;
    Node left;

    int height;

    public Node(int val){
        this.val=val;
    }

    public int getHeight(){
        return height;
    }
    public int getVal(){
        return val;
    }

}

public class BinarySearchTree {
   public BinarySearchTree(){

   }


   Node root;

   public void insert(int data){
       root=insertRecursive(root,data);
   }
   public Node insertRecursive(Node root,int data){
       if(root == null) root = new Node(data);
       else if(root.val > data){
           root.left=  insertRecursive(root.left,data);
       }
       else if (root.val < data){
           root.right= insertRecursive(root.right,data);
       }
       return root;
   }

   public void inorderTraversal(){
    // left root right

       // there is nothing much in preorder RLR, post order LRRoot, inorder LRR and
       inorderTraversalRec(root);
   }

   public void inorderTraversalRec(Node root){
      if(root != null){
          inorderTraversalRec(root.left);
          System.out.print(root.getVal() + " ");
          inorderTraversalRec(root.right);
      }
   }

}
