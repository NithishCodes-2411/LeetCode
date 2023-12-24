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
    
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

      if(root == null ) return new ArrayList <>();
      List<List<Integer>> ans = new ArrayList <>();
      if(root.left == null && root.right == null ){
        List<Integer> a = new ArrayList <>();
        a.add(root.val);
        ans.add(a);
        return ans;
      }

      
      Queue <TreeNode> q = new LinkedList <>();
      q.offer(root); // adding 

      while(!q.isEmpty()){

        int clSize = q.size();
  
        List<Integer> lvl = new ArrayList<>(); 

        for(int i=0; i<clSize; i++){
          TreeNode curr = q.poll();
          lvl.add(curr.val);
          if(curr.left != null){
            q.add(curr.left);
          }
          if(curr.right != null){
            q.add(curr.right);
          }

        }
        System.out.println(lvl);
        ans.add(lvl);
      }
      List<List<Integer>> finalans = new ArrayList <>();
      for(int i=ans.size()-1 ; i>=0; i--){
        finalans.add(ans.get(i));
      }
      return finalans;

          
      
     
    


  
    }
}