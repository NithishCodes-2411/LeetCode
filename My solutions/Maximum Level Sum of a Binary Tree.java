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
    public int maxLevelSum(TreeNode root) {

      if(root.left == null && root.right == null ) return 1;

      int lvl = 1;
      int ans = 0;
      int max  = Integer.MIN_VALUE;


      Queue<TreeNode> q = new ArrayDeque<>();
      q.add(root);

      while(!q.isEmpty()){

        int ls = q.size();

        int sum = 0;
        for(int i=0; i<ls; i++){
          TreeNode curr = q.poll();
          sum += curr.val;
          if(curr.left != null ) q.add(curr.left);
          if(curr.right != null ) q.add(curr.right);
        }
       
        if(sum>max){
          ans = lvl;
          max = sum;
        }
        lvl++;


      }
      return ans;
      

        
    }
}