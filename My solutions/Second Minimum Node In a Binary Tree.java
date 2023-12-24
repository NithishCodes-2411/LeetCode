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
    HashSet  <Integer> ans = new HashSet <Integer> ();


    public int findSecondMinimumValue(TreeNode root) {

      travs(root);
      Integer[] array = ans.toArray(new Integer[0]);

       
        Arrays.sort(array);

        // Check if there are at least two elements in the set
        if (array.length < 2) {
            
            return -1;
        }
        return array[1];
     

   

    
    }
    public void travs(TreeNode root){

    if(root!=null){
            

            travs(root.left);
            ans.add(root.val);
            travs(root.right);
    }


    }
}