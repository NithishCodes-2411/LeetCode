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
    public TreeNode replaceValueInTree(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<>();
        ArrayList<Integer> sums = new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){   
            int ls= q.size();
            int sum =0;
            for(int i=0; i<ls; i++){
                TreeNode curr = q.poll();
                sum += curr.val;
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            sums.add(sum);
        }
        System.out.print(sums);
        root.val = 0;
        q.add(root);
        int lvl = 1;
        while(!q.isEmpty()){
            int ls = q.size();
            for(int i=0; i<ls; i++){
                TreeNode curr = q.poll();
                int ns = 0;//node sum
                if(curr.left != null) ns += curr.left.val;
                if(curr.right != null) ns += curr.right.val;

                if(curr.left != null) curr.left.val = sums.get(lvl) - ns;
                if(curr.right != null) curr.right.val = sums.get(lvl) - ns;
                
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);

            }
            lvl++;
        }
        return root;



        

        
    }
}