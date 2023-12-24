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
    public List<Integer> rightSideView(TreeNode root) {
       List<Integer> ans = new ArrayList <Integer>();

       Queue <TreeNode> q = new LinkedList <>();
       if(root == null ) return new ArrayList <Integer>() ;
       if(root.left == null && root.right == null){
         ans.add(root.val);
         return ans;
       }
       q.add(root);
       
       while(!q.isEmpty()){

         int ls = q.size();
         TreeNode rv = null;
         for(int i=0; i<ls; i++){
           rv = q.poll();
           if(rv.left != null){
             q.add(rv.left);
           }
           if(rv.right != null){
             q.add(rv.right);
           }
         }
         ans.add(rv.val);


       }
       return ans;



        
    }
}