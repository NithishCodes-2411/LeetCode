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
    ArrayList <Integer> nums = new ArrayList <>();
    
    public int minDiffInBST(TreeNode root) {
      travs(root);
      //System.out.println(nums);
      int ans = Integer.MAX_VALUE;
      for( int i=1; i<nums.size(); i++){
        int diff = Math.abs(nums.get(i)-nums.get(i-1));
        //System.out.println(diff);
        ans = Math.min(ans , diff);
        
      }

      
      return ans;  
    }
    public void travs (TreeNode root){
      if(root!=null){
        travs (root.left);
        nums.add(root.val);
        travs (root.right);
      }
    }
}