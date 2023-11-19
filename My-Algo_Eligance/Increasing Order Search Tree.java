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
    ArrayList <Integer> tree = new ArrayList <> ();
    public TreeNode increasingBST(TreeNode root) {
      inOrder(root);
      TreeNode ans = new TreeNode ( tree.get(0));
      TreeNode parent = ans;
      TreeNode right ;

     
      for( int i=1 ; i<tree.size(); i++) {
         right = new TreeNode ( tree.get(i) );
         parent.right = right;
         parent = parent.right;
      }
      return ans;
     
      
      
        
    }
    public void insert ( TreeNode root  , int val   ) {
  
      TreeNode newNode = new TreeNode(val);

      if (root == null) {
            root = newNode;
            return;
      }
      while ( root.right != null  ) {
        root = root.right;
      }
      root.right = newNode ;
    }

    public void  inOrder  ( TreeNode root ){
       if(root!=null){
         inOrder ( root.left);
         tree.add(root.val);
         inOrder ( root.right);
       }
    }
}
