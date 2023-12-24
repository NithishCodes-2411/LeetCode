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
   int ans ;
    public int distributeCoins(TreeNode root) {
      ans  = 0;
      sol(root);
      return ans;
        
    }
    public int sol(TreeNode root ){

      if(root==null){
        return 0;
      }
 
      int coin  = sol(root.left) + sol(root.right) + root.val -1 ;

      ans = ans + Math.abs(coin);

      return coin; 
      
    }
}