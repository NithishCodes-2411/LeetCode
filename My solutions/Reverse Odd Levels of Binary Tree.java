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
    public TreeNode reverseOddLevels(TreeNode root) {

      if(root.left == null && root.right == null ) return root;
      Queue<TreeNode> q =new  ArrayDeque<TreeNode> ();

      q.add(root);
      int lvl=1; //lvl
      while(!q.isEmpty()){

        int ls = q.size();
        TreeNode [] arr = new TreeNode [ls];
        int [] vals = new int [ls];
        for(int i=0; i<ls; i++){
          TreeNode curr = q.poll();
          arr[i] = curr;
          vals[i] = curr.val;
          if(curr.left!=null) q.add(curr.left);
          if(curr.right != null )q.add(curr.right);
        }
        if(lvl%2==0){
          int j=ls-1;
          for(int i=0; i<ls; i++){
            arr[i].val = vals[j];
            j--;
          }

         
        }
        lvl++;

      }
      return root;


    }
}