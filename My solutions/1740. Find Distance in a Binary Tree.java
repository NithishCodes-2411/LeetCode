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
    ArrayList<Integer> pPath  = new ArrayList<>();
    ArrayList<Integer> qPath = new ArrayList<>();
    public int findDistance(TreeNode root, int p, int q) {
      
      if(p==q) return 0;   

      root = lca(root , p , q);
      findPathHelper(root , p , pPath);
      findPathHelper(root , q , qPath);
      return pPath.size() + qPath.size() -2;
  
   
    }
    public static TreeNode lca (TreeNode node , int p , int q ){
        if(node== null || node.val == p || node.val == q){
            return node;
        }
        TreeNode left = lca(node.left , p , q);
        TreeNode right = lca(node.right , p , q);
        if(left !=null && right != null) return node;
        return left != null ? left : right;

    }
    
        private static boolean findPathHelper(TreeNode node, int target, ArrayList<Integer> path) {
        if (node == null) {
            return false;
        }

        path.add(node.val);

        if (node.val == target || findPathHelper(node.left, target, path) || findPathHelper(node.  right, target, path)) {
            return true;
        }

        path.remove(path.size() - 1);
        return false;
    }

 
}