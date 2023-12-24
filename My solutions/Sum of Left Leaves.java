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
    public int sumOfLeftLeaves(TreeNode root) {
      travs (root);
      return ans;
        
    }
    public void travs  (TreeNode root) {
      if(root!=null){
        TreeNode l = root.left;
        if(l != null && l.left == null && l.right == null){
          ans += l.val;
        }
        travs(root.left);
        travs (root.right);

      }
    }
}