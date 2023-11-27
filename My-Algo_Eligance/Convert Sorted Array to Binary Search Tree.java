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
    public TreeNode sortedArrayToBST(int[] nums) {

        return sol(nums , 0 , nums.length-1);
        
    }
    public TreeNode sol(int[] nums , int left , int right ){
        int mid = (left + right) /2;
        TreeNode root = new TreeNode ( nums[mid] );
        if(left < mid){
            root.left =  sol(nums , left , mid -1 );
        }
        if(right > mid ){
            root.right = sol(nums, mid +1 , right);
        }
        return root;
    }

}