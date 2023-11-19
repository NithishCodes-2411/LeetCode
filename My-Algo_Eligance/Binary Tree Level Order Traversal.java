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
    public List<List<Integer>> levelOrder(TreeNode root) {

      List<List<Integer>> ans = new ArrayList <>();
      Queue <TreeNode> q = new LinkedList<>();
      if(root==null){ return new ArrayList <>();}
      if(root.left == null && root.right == null ){
           List<Integer> a = new ArrayList <>();
           a.add(root.val);
           ans.add(a);
           return ans;
      }
      q.add(root);

      while(!q.isEmpty()){

        int ls = q.size(); // level size
        List<Integer> lvl = new ArrayList <>();

        for(int i=0; i<ls; i++){

          TreeNode curr = q.poll();
          lvl.add(curr.val);

          if(curr.left != null){
            q.add(curr.left);
          }
          if(curr.right != null) {
            q.add(curr.right);
          }



        }
        ans.add(lvl);


      }
      return ans;



        
    }
}