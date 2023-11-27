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
    int answer = 0;
    double diff = Integer.MAX_VALUE;
    public int closestValue(TreeNode root, double target) {

        sol(root , target);  
        return answer; 
    }
    public void sol (TreeNode root , double t){
        if(root!=null){
            sol(root.left , t);
            double d = Math.abs(t - root.val);
           // System.out.println(d + " "+ root.val);
            if(d < diff){
                diff = d;
                answer = root.val;
            }
            sol(root.right , t);

        }
    }
}