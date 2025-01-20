package Datastructure.Trees;

import javax.swing.tree.TreeNode;
import java.util.*;

public class BFSImpl {
    /*
    *  if the you have given the Binary Tree
    *  and asked to print tree in level wise mannar
    *  this means it has to Use Breath First Search
    *
    *  When to Use it
    *  1. When answer lies near the root node
    *  2. When you are asked to search by level
    *
    * */
    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }

    public static void main(String[] args) {

    }

    // traversing trough level order in Binary tree  Leetcode Problem 102
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result= new ArrayList<>();

        if(root == null) return result;

        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int levelSize=q.size();
            List<Integer> currLevel= new ArrayList<>();
            for(int i=0;i<levelSize;i++){
                TreeNode currNode= q.poll();
                currLevel.add(currNode.val);
                if(currNode.left != null){
                    q.offer(currNode.left);
                }
                if(currNode.right != null){
                    q.offer(currNode.right);
                }
            }
            result.add(currLevel);
        }
        return result;
    }

    public int findSuccessorInOrder(TreeNode root, int target){
        // just right node of target node within the tree . it can be in right subtree or child;
        if(root == null) return -1;
        int result=-1;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode curr= q.poll();
            if(curr.left != null){
                q.offer(curr.left);
            }
            if(curr.right != null){
                q.offer(curr.right);
            }
            if(curr.val == target){
                break;
            }
        }
        return q.peek().val;
    }
}
