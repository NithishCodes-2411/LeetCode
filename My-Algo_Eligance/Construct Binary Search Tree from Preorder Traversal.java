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
    public TreeNode bstFromPreorder(int[] preorder) {

        int [] inorder = new int [preorder.length];
        for(int i=0; i<preorder.length; i++) inorder[i] = preorder[i];
        Arrays.sort(inorder);
        HashMap<Integer , Integer > map = new HashMap <>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i] , i);
        }
        return sol(preorder , map , 0 , 0 , preorder.length-1);
     
    }
    public TreeNode sol(int [] preorder , HashMap <Integer , Integer> map , int rootpos , int left , int right){


         TreeNode root = new TreeNode ( preorder[rootpos] );
         int mid = map.get( preorder[rootpos] );
         if(mid > left) {
             root.left = sol( preorder , map , rootpos+1 , left , mid -1 );
         }
         if(mid < right  ){
             root.right = sol(preorder , map , rootpos+(mid-left)+1 , mid+1 , right);
         }
         return root;




 

    }
}