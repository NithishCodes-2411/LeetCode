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
    public TreeNode[] splitBST(TreeNode root, int target) {
        TreeNode[] result = new TreeNode[2];
        if(root == null){return result;}

        if(root.val <= target){
            //When value at root is less than or equal to target value, we have to split at right side
            result[0] = root;
            TreeNode[] right = splitBST(root.right, target);
            //since splitting at right side, we need to fix root.right pointer
            //root.right should be the values which is coming from the sub problem at 0th index
            root.right = right[0];
            result[1] = right[1];
        }else{
            //since node is greater than the target value, we need to split in the left side
            //hence 1st index of result should be root
            result[1] = root;
            TreeNode[] left = splitBST(root.left, target);
            //Since left side is splitted, we need to fix root.left
            //root.left must come from the recursion and its value must be the 1st index 
            root.left = left[1];
            result[0] = left[0];
        }
        return result;
    }
}