package Datastructure.Trees;

public class Main {
    public static void main(String[] args) {
//        BinarySearchTree tree= new BinarySearchTree();
//
//        System.out.println("Inserting Elements");
//        tree.insert(10);
//        tree.insert(12);
//        tree.insert(13);
//        tree.insert(9);
//        tree.insert(2);
//        tree.insert(99);
//        tree.insert(47);
//        System.out.println("Insertion Completed");
//        System.out.println("Retrieving Elements");
//        tree.inorderTraversal();
//        System.out.println("Retrieval completed");

        BSTImplStandard tree=new BSTImplStandard();
        tree.insert(10);
        tree.insert(12);
        tree.insert(13);
        tree.insert(9);
        tree.insert(2);
        tree.insert(99);
        tree.insert(47);
        tree.isBalanced();
        tree.display();

        tree.preOrder();
        System.out.println();
        tree.inOrder();
        System.out.println();
        tree.postOrder();
    }
}
