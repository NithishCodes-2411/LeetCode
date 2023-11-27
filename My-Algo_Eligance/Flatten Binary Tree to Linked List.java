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
    ArrayList<TreeNode> ll = new ArrayList<>();
    public void flatten(TreeNode root) {
        sol(root);

        
        if(ll.size()>0) ll.get(0).left = null;
        for(int i=1; i<ll.size(); i++){
            ll.get(i-1).right = ll.get(i);
            ll.get(i).left = null;
        }

        
    }
    public void sol(TreeNode root){
        if(root!=null){
            ll.add(root);
            sol(root.left);
            sol(root.right);
        }
    }
}