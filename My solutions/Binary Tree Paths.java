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
    List<String> ans = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
       
        sol(root , "");
         return ans;
        
    }
    public void sol(TreeNode root , String s){
        if(root!=null){
            s+= "->"+root.val;

            sol(root.left , s);
            sol(root.right ,s);
            if(root.left == null && root.right == null){
                ans.add(s.substring(2));
            }
        }
    }

}