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
    int ans = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {

      height(root , 0 );
      if(ans == Integer.MAX_VALUE ) return 0;
      return ans;
  
      

        
    }
    public void   height (TreeNode root ,  int n) {
          if (root != null){
            if(root.left==null && root.right == null ){
              ans = Math.min(ans , n+1 );
            }
            height(root.left , n+1);
            height ( root.right , n+1);
          }
       
   
    }
}