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
    public List<Double> averageOfLevels(TreeNode root) {

      List<Double> ans = new ArrayList <>();
      if(root.left == null && root.right == null){
        Double a = new Double (root.val);
        ans.add(a);
        return ans;
      }
      Queue <TreeNode> q = new LinkedList <>();
      q.add(root);
      while(!q.isEmpty()){

        double ls = q.size(); // lvl size 

        double total = 0.0;
        for(int i=0; i<ls; i++){
          TreeNode curr = q.poll();
          total += curr.val;

          if(curr.left != null){
            q.add(curr.left);
          }
           if(curr.right != null){
            q.add(curr.right);
          }
        }
        double avg = total / ls;
        ans.add(avg);




      }
      return ans;

     

        
    }
    
}