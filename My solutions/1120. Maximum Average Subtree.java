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
    double n = 0;
    
    public double maximumAverageSubtree(TreeNode root) {
      

      helper(root);
      return n;
    

        
    }
    public int[] helper (TreeNode root){
        if(root == null ) return new int []{ 0 , 0};
        int [] left = helper(root.left);
        int [] right = helper(root.right);
        int nodesum = left[0] + right[0] + root.val;
        int modecount = left[1] + right[1] + 1;
        double average = (double) nodesum / modecount;
        n = Math.max(n , average);
        return new int []{nodesum , modecount};


    }

        

    
}