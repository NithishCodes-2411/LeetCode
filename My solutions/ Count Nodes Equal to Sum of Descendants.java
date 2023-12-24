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
    int count = 0;
    public int equalToDescendants(TreeNode root) {
        sol(root);
        return count;
        
    }
    public int sol (TreeNode root ){
         if(root==null){
             return 0;
         }
         else{
             int sum = sol(root.left) + sol(root.right);
             if(sum == root.val){
                 count++;
             }
             sum += root.val;
             return sum;

         }
    }
}