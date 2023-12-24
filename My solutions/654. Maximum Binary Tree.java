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
   
    public TreeNode constructMaximumBinaryTree(int[] nums) {
      if(nums.length == 1) return new TreeNode(nums[0]);
        return sol(nums , new TreeNode() , 0 , nums.length );
    }
    public TreeNode  sol (int [] nums, TreeNode root  , int l , int h){
       
           if(l==h) return null;
           
           if(root == null ) root = new TreeNode();
           int index  = 0;
           int max = Integer.MIN_VALUE;
           for(int i=l ; i<h ; i++){
              if(nums[i]>max){
                max = nums[i];
                index = i;
              }
           }
           root.val = max;
           if(l<index) root.left = sol(nums , new TreeNode () , l , index);
           if(index+1<= h ) root.right = sol(nums , new TreeNode() , index+1 , h);

           return root ;


      
    }
}