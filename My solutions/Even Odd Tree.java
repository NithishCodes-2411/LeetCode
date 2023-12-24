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
    
    
    public boolean isEvenOddTree(TreeNode root) {
        
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        int level = 0;

        while (!q.isEmpty()) {
            int qSize = q.size();

            
           
            TreeNode prevNode = null; 
            

           
            for (int i = 0; i < qSize; i++) {
                TreeNode currentNode = q.poll();
                if (level % 2 == 0) {
               
                    if (currentNode.val % 2 == 0) return false;

                   
                    if (prevNode != null && prevNode.val >= currentNode.val) {
                        return false;
                    }
                } else {
               
                    if (currentNode.val % 2 > 0) return false;

                    
                    if (prevNode != null && prevNode.val <= currentNode.val) {
                        return false;
                    }
                }

               
                prevNode = currentNode;

               
                if (currentNode.left != null) q.offer(currentNode.left);
                if (currentNode.right != null) q.offer(currentNode.right);
            }
            level++;
        }

        return true;
    }
}