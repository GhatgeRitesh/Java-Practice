package Trees;

public class BinarySearchTree {
     public BinarySearchTree(){

     }

     public class Node{
        private  int val;
        private Node left;
        private Node right;
        private int height;
         public Node(int val){
             this.val=val;
         }
         public int getVal(){
             return val;
         }
     }

     private Node root;

     public int height(Node node){
         if(node == null) return -1;
         return node.height;
     }

     public boolean isEmpty(){
         return root == null;
     }

     public void display(){
         display(root , "Root Node ");
     }

     private void display(Node node, String details){
         if(node == null) return ;
         System.out.println(details + node.getVal());

         display(node.left ,"Left child of "+ node.getVal() +" : ");
         display(node.right  ,"right child of "+ node.getVal() +" : ");

     }

     public void insert(int val){

     }
     private Node insert(int val, Node node){
         if(node == null){
             node = new Node (val);
             return node;
         }

         if(val < node.val) node.left= insert(val, node.left);
         if(val > node.val) node.right= insert(val, node.right);

         node.height = Math.max(height(node.left), height(node.right))+1;

         return node;
     }

     public boolean isBalanced(){
        return isBalanced(root);
     }

     private boolean isBalanced(Node node){
         if(root == null) return true;
         return Math.abs(height(node.left)- height(node.right)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
     }

}
