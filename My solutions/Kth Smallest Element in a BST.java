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
    ArrayList <Integer> ans = new ArrayList <>();
    public int kthSmallest(TreeNode root, int k) {

      sol(root);
     
      return ans.get(k-1);


        
    }
    public void sol(TreeNode root){
      if(root!=null){
        sol(root.left);

        ans.add(root.val);

        sol(root.right);
      }
    }
}