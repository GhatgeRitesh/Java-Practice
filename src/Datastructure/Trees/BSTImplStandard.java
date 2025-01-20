package Datastructure.Trees;

public class BSTImplStandard {

    public BSTImplStandard(){}


    public class Node{
        private Node left;
        private int val;
        private Node right;

        private int height;

        public Node(int data){
            this.val=data;
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
        display(root , " Root Node: " );
    }

    private void display(Node node, String details){
        if(node == null) return;
        System.out.println(details + node.getVal());

        display(node.left , "left child of " + node.getVal() +" : ");
        display(node.right, "right child of "+ node.getVal() + " : ");
    }

    public void insert(int data){
         root= insert(root, data);
    }
    public Node insert(Node node, int data){
        if(node == null) {node= new Node(data); return node ;}
        if(node.getVal() == data){
            System.out.println("The Value is already present into the tree duplication is not allowed"); return node;
        }
        if(node.getVal() > data){
           node.left= insert(node.left,data);
        }
        else{
           node.right= insert(node.right, data);
        }
        node.height = Math.max(height(node.left),height(node.right)+1);
        return node;
    }

    public boolean isBalanced(){
      return isBalanced(root);
    }
    private boolean isBalanced(Node node){
        if(node == null) return true;
        return Math.abs(height(node.left)- height(node.right)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }


    // implement the traversals

    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node == null)return;
        System.out.print(node.getVal()+" ");
        preOrder(node.left);
        preOrder(node.right);

    }
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if(node == null) return;
        inOrder(node.left);
        System.out.print(node.getVal()+" ");
        inOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.getVal()+" ");
    }

    // traversals used with the tree are
    // 1. PreOrder N , L , R  -- used in Evaluating of Mathematical Expressions
    // 2. InOrder L , N , R -- used in the BST to visit it in sorted manner
    // 3. PostOrder L, R, N -- used in Delete in Binary Tree , Bottom-up calculations , height calculation , diameter of tree
}
