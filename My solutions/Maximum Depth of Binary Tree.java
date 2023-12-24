/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
  
    public int maxDepth(TreeNode root) {

      return (max)

    
      
        
    }
    public int max(TreeNode root , int len){
      if(root==null){ return -1;}

      int l = max(root.left , len+1);
      int r = max(root.right , len+1);
      return Math.max(l,r);

    }

}