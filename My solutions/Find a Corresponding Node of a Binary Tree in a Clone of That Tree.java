/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode ans ;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {

       sol(cloned , target);
       return ans;


        
    }
    public void sol (TreeNode root , TreeNode t){
      if(root == null){
        
      }
      else{
        sol(root.left , t);
        sol(root.right , t);
        if(root.val == t.val){
          ans = root;
        }
      }
      
    }
}