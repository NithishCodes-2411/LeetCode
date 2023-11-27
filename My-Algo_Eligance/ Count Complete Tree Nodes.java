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
    //ArrayList<Integer> nodes = new ArrayList<>();
    public int countNodes(TreeNode root) {
        return sol(root);
        
    }
    public int sol(TreeNode root){
        if(root == null) return 0;
        else{
            return 1+ sol(root.left) + sol(root.right);
        }
    }

}