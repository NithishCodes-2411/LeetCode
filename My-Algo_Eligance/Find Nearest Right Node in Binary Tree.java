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
    public TreeNode findNearestRightNode(TreeNode root, TreeNode u) {

        Queue <TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){

            int ls = q.size();
            int i=0;
            ArrayList<Integer> ans = new ArrayList<>();
         
            for(i=0; i<ls ; i++){
                TreeNode curr = q.poll();
                // System.out.print(curr.val+" ");
                ans.add(curr.val);
                if(curr.val == u.val){
                    if(i<ls-1){
                        return q.poll();
                    }else{
                        return null;
                    }
                    
                }
                if(curr.left != null ) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);

            }

            
        }
        return null;
        
    }
}