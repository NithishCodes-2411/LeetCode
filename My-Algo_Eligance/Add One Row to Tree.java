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

    public TreeNode addOneRow(TreeNode root, int val, int depth) {

      ArrayList <List<TreeNode>> bfs = new ArrayList<>();
      Queue<TreeNode> q = new LinkedList <>();
      if(depth == 1){
        TreeNode nn = new TreeNode (val);
        nn.left = root;
        root = nn;
        return root; 
      } 
      q.add(root);
      while(!q.isEmpty()){
          int ls = q.size();
          List<TreeNode> lvl = new ArrayList<>();
          for(int i=0; i<ls; i++){
            TreeNode curr =q.poll() ;
            lvl.add( curr );
            if(curr.left != null ){
              q.add(curr.left);
            }
            if(curr.right != null ){
              q.add(curr.right);
            }   
          }
          bfs.add(lvl);  
      }
      depth = (depth-2);
      if(depth>=0){
        
        for(TreeNode t : bfs.get(depth)){
          TreeNode tl = t.left;
          TreeNode tr = t.right;

          TreeNode nn1 = new TreeNode (val);
          TreeNode nn2 = new TreeNode (val);

          nn1.left = tl;
          nn2.right = tr;

          t.left = nn1;
          t.right = nn2;
          
        }

      }
      return root;
      
  
 
}
}