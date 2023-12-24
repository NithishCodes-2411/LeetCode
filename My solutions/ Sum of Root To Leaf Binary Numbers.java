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
    ArrayList <String> nums = new ArrayList <>();

    public int sumRootToLeaf(TreeNode root) {
      travs (root , "");
      int ans = 0;
      for(String n : nums){
         ans += Integer.parseInt(n , 2);
      }
      return ans;
        
    }
    public void travs (TreeNode root , String num  ){
      if(root == null ) return;
      if(root.left==null && root.right == null ) {
        num += root.val;
        nums.add(num);
        return;
      }
      num += ""+root.val;
      travs(root.left , num);
      travs(root.right , num);
    }
}