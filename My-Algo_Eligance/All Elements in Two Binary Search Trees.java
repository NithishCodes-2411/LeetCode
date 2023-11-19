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
  List <Integer> ans = new ArrayList <Integer> ();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
      sol(root1);
      sol(root2);
      Collections.sort(ans);
      return ans;
        
    }
    public void sol(TreeNode root){
      if(root!=null){
        sol(root.left);
        ans.add(root.val);
        sol(root.right);
      }
    }
}