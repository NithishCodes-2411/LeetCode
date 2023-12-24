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
    public TreeNode removeLeafNodes(TreeNode root, int target) {

      sol(root.left , target , root , true);
      sol(root.right , target , root , false);
      if(root.left == null && root.right==null && root.val == target){
        return null;
      }
      return root;
        
    }
    public void sol(TreeNode root , int t , TreeNode parent , boolean left  ){
      if(root!=null){
        sol(root.left , t , root , true);
        sol(root.right , t , root , false);

        if(root.left == null && root.right==null && root.val == t){

          if(left){ parent.left = null;}
          else{
            parent.right = null;
          }

        }
      
      }

    }
}