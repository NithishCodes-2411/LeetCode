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
    public List<Integer> largestValues(TreeNode root) {
      List <Integer> ans = new ArrayList<>();
      Queue <TreeNode> q = new LinkedList<>();
      
      if(root==null) return new ArrayList<>();
      if(root.left == null && root.right == null){
        ans.add(root.val);
        return ans;
      }
      q.add(root);
      while(!q.isEmpty()){
        int ls = q.size();
        int max = Integer.MIN_VALUE;
        for(int i=0; i<ls; i++){
          TreeNode curr = q.poll();
          if(curr.left != null) q.add(curr.left);
          if(curr.right != null ) q.add(curr.right);
          max = Math.max(max , curr.val);
        }
        ans.add(max);

      }
      return ans;
        
    }
}