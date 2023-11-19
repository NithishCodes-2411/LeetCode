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
    TreeNode [] ans = new TreeNode [2];
    public boolean isCousins(TreeNode root, int x, int y) {
      int xl = travs(root , x, 0,0 , null);
      int yl = travs(root , y,0, 1,null);
      //System.out.print()
      if(ans[0]==null){
         if( xl == yl ){
        return true;
      }
      return false;
      }
      if(ans[1]==null){
         if( xl == yl){
        return true;
      } 
      return false;
      }
       if( ans[1].val != ans[0].val &&  xl == yl){
        return true;
      }
      return false;
        
    }
    public int travs (TreeNode root , int k, int lvl , int parent, TreeNode prev ){

      if(root == null ) { return -1;}
      else if (root.val == k){
         ans[parent] = prev;
        return lvl;
      }
      else{
       
        int l = travs(root.left , k , lvl+1, parent , root);
        int r = travs(root.right , k , lvl+1, parent, root);
        return Math.max(l,r);
      }

    }
}