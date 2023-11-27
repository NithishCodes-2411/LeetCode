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
    String ans = "";
    int i =0;
    public String smallestFromLeaf(TreeNode root) {
      
      if(root.left == null && root.right == null){

      }
      sol(root , "");
      return ans;

        
    }
    public void sol(TreeNode root , String w){


      if(root!=null){
      int x = root.val + 97;
      char c = (char)x;
      w+=c;
      sol(root.left , w);
      sol(root.right , w);
      if(root.left == null && root.right == null){
        w = new StringBuilder(w).reverse().toString();
        if(i==0){ 
          ans = w;
          i++;
        }
        int com = w.compareTo(ans);
        if(com<0){
          ans = w;
        }
      }
      }
      


    }
}