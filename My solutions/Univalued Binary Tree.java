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
    HashSet <Integer> ans = new HashSet <>();
    public boolean isUnivalTree(TreeNode root) {
      travs(root); 
     
      return ans.size()==1;   
    }
    public void travs (TreeNode root){
      if(root!=null){
        travs(root.left);
        ans.add(root.val);
        travs(root.right);
      }
    }
}