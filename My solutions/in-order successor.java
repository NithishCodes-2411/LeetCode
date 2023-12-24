/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    ArrayList<TreeNode> nodes = new ArrayList<>();
    int index = 0;
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        sol(root , p);
        if(index<nodes.size()) return nodes.get(index);
        return null;
        
    }
    public void sol(TreeNode root , TreeNode p){
        if(root!=null){
            sol(root.left , p);



            nodes.add(root);
            if(root.val == p.val){ 
                index = nodes.size();
            }

            
 
            sol(root.right , p);

        }
    } 
}