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
    int ans = 1;
    public int goodNodes(TreeNode root) {

      if(root == null) return 0;

      if(root.left == null && root.right == null ){
        return 1;
      }
      sol(root.left , root.val);
      sol(root.right , root.val);
  
     return ans;
        
    }
    public void sol(TreeNode root , int max ){
      if(root!=null){

        //ystem.out.println(root.val + " max:" + max );

        if(max <= root.val){
          ans++;
        }
        //max = Math.max(max , root.val);
        
        sol(root.left , Math.max(max , root.val) );
        sol(root.right , Math.max(max , root.val) );


      }
    }
}