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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         
         List<List<Integer>> ans = new ArrayList<>(); // ans list

         // edge cases
         if(root == null ) return new ArrayList<>();
         if(root.left == null && root.right == null){

           List<Integer> innerlist = new ArrayList<>();
           innerlist.add(root.val);
           ans.add(innerlist);
           return ans;
         }
        

         Queue <TreeNode> q = new LinkedList<>();
         q.add(root);
         int j=0;

         //bfs
         while(!q.isEmpty()){
            int ls = q.size(); //lvl size
            ArrayList<Integer> lvl = new ArrayList<>(); // inner list

            for(int i=0; i<ls; i++){
              TreeNode curr = q.poll();
              lvl.add(curr.val);
              if(curr.left!=null) q.add(curr.left);
              if(curr.right != null) q.add(curr.right);
            }
            if(j%2==1) Collections.reverse(lvl);
           
            ans.add(lvl);
            j++;
         }
         return ans;


        
    }
}