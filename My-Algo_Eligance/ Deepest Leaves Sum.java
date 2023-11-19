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
    int ans =0;
    int maxH = 0;
    public int deepestLeavesSum(TreeNode root) {

      maxH = h(root);
      sol(root , 0);
      return ans;

    }
    public void sol(TreeNode root , int h){

      if(root!=null){
          sol(root.left , h+1);
          if(h==maxH ){
            ans += root.val;
          }
          sol(root.right , h+1);
      }


    }
    public  int h(TreeNode root){
      if(root==null){
        return -1;
      }
      else{
        int l = h(root.left);
        int r = h(root.right);
        return 1+ Math.max(l ,r);
      }
    }
       

}