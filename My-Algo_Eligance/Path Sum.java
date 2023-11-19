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
    boolean  ans = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {

      sol(root , targetSum , 0);
      return ans;
        
    }
    public void  sol(TreeNode root , int k, int sum){
       
       if(root!=null){

         sol(root.left , k , sum+root.val);
         if(root.left == null && root.right == null ){
           sum = sum+root.val;
           if(sum == k){
             ans = true;
           }

         }
         sol(root.right , k , sum+root.val);


       }


    }
}