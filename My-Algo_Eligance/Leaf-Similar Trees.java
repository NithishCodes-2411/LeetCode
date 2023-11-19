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
    ArrayList <Integer> t1 = new ArrayList <>();
    ArrayList <Integer> t2 = new ArrayList <>();
    

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

      travs1(root1);
      travs2(root2);
      
      return t1.equals(t2);


        
    }
    public void travs1( TreeNode root ){
      if(root!=null){
        if(root.left == null && root.right ==  null ){
          t1.add(root.val);
        }
        travs1(root.left);
        travs1(root.right);
      }

    }
    public void travs2 (TreeNode root ){
         if(root!=null){
        if(root.left == null && root.right ==  null ){
          t2.add(root.val);
        }
        travs2(root.left);
        travs2(root.right);
      }

    }
}