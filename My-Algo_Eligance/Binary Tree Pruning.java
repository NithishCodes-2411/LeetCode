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
    public TreeNode pruneTree(TreeNode root) {
           if(root.val == 0 && root.left == null && root.right == null){
        return null;

      }
      sol(root.left , root , true);
      sol(root.right , root ,false);
      if(root.val == 0 && root.left == null && root.right == null){
        return null;

      }
      return root;

        
    }
    public void sol(TreeNode root , TreeNode parent, boolean left ){

      if(root!=null){
        sol(root.left , root , true);
        sol(root.right , root , false);

        if(root.val == 0 && root.left == null && root.right == null){
          if(left){
            parent.left = null;
          }
          else{
            parent.right = null;
          }
        }

        }
      }

    }
