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
    List<List<Integer>> ans = new ArrayList <>();
    public List<List<Integer>> findLeaves(TreeNode root) {
        sol(root);
        return ans;

        
  
    }
    public int  sol(TreeNode root){
        if(root == null){
            return -1;
        }
        int l =  sol(root.left);
        int r =   sol(root.right);

        int h = Math.max(l,r)+1;
        if(ans.size()==h){
            ans.add(new ArrayList<Integer>());
        }
        this.ans.get(h).add(root.val);
        return h;



    }
}