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
    public TreeNode insertIntoBST(TreeNode root, int val) {
  if(root == null ){

     return new TreeNode (val);
         
       }
       sol(root , val);
 
      return root;
   


        
    }
    public void sol(TreeNode root , int val){
      if(root!=null){


        if(root.val > val){
          if(root.left == null ){
            root.left = new TreeNode (val);
            //return true;
          }
          else{
            sol(root.left , val);
          }
        }
        else if(root.val < val){
           if(root.right == null){
             root.right = new TreeNode (val);
           }
           else{
             sol(root.right , val);
           }
        }
        else{
          //return false;
        }


      }
    }
}