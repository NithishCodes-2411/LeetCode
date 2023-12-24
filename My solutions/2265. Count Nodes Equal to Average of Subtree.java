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
    int ans = 0;
    public int averageOfSubtree(TreeNode root) {

        if(root.left == null && root.right == null) return 1;
        dfs(root);
        return ans ;


        
    }
    // new int [] { nodesum , nodecount }
    public int [] dfs(TreeNode root){
            if(root!=null){
                int [] left = dfs(root.left);
                int [] right = dfs(root.right);

                int nodesum =  root.val + left[0] + right[0];
                int  nodecount = 1 + left[1] + right[1];

                int avg = nodesum / nodecount;
                if(avg == root.val ) this.ans++;
                return new int []{nodesum , nodecount};
            }
            else return new int []{0 , 0};
    }


}