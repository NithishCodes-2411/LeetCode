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
    int ans = 0;
    public int sumNumbers(TreeNode root) {

      if(root.left == null && root.right == null){
        return root.val;
      }
      sol(root , "");
      return ans;
        
    }
    public void sol(TreeNode root , String num){

      if(root != null ){
         num += root.val;
         sol(root.left , num);
         sol(root.right , num );
         if(root.left == null && root.right == null){
            int n = Integer.parseInt(num);
            ans += n;
         }
      }

    }
}