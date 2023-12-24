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
    ArrayList <Integer> arr = new ArrayList <Integer>();
    public boolean findTarget(TreeNode root, int k) {

      travs(root);
      HashSet<Integer> numSet = new HashSet<>();
      for(int i=0; i<arr.size(); i++){
        int complement = k - arr.get(i);
         if (numSet.contains(complement)) {
                return true;  // Pair found
            }  
         numSet.add(arr.get(i));
      }
      return false;

        
    }
    public void travs (TreeNode root){
      if(root!=null){
        travs(root.left);
        arr.add(root.val);
        travs(root.right);
      }

    }
}