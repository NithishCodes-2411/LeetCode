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
    List<Integer>  ans = new ArrayList<>();
    public List<Integer> getLonelyNodes(TreeNode root) {
        sol(root , null);
        return ans;
        
    }
    public void sol(TreeNode root , TreeNode parent ){

        if(root!=null){
            sol(root.left , root);
            sol(root.right , root);
            if(parent != null && (parent.left == null || parent.right == null))
            {
                this.ans.add(root.val);
            }
        }

    }
}