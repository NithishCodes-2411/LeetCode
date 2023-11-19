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
    int d = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {

      int x = h(root);
      return d;


        
    }

    public  int  h(TreeNode root ){
      if(root == null ){ return 0;}
      else{
        int l = h(root.left);
        int r = h(root.right);
        // int maxd = l+h;
        d = Math.max(d , l+r);
        return 1+ Math.max(l,r);
      }
    }

}