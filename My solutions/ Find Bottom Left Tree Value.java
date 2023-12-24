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
    boolean  brk = true;
    public int findBottomLeftValue(TreeNode root) {
       
      if(root.left == null && root.right == null ){
        return root.val;
      }
      int lowest =  h(root);
      
      
      sol(root.left , lowest , true , 1);
      sol( root.right , lowest , false , 1);

      return ans;
   
    }

    public void sol( TreeNode root ,int  h  , int currH ){

      if(root!=null){
           sol(root.left , h  , currH+1);
           sol(root.right , h  , currH +1);
           if(brk &&  currH == h){
             ans = root.val;
             brk = false;
           }

      }

    }
    public int h(TreeNode root ){
      if(root!=null){
        int l = h(root.left);
        int r = h(root.right);
        return 1 + Math.max(l,r);
      }
      else{
        return -1;
      }
    }
}