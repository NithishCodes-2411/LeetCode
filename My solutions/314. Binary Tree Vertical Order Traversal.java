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
    public List<List<Integer>> verticalOrder(TreeNode root) {
        if(root==null) return new ArrayList<>();
        ArrayList<Integer> [] arr = new ArrayList [101];
        bfs(arr , root , 50);
        List<List<Integer>>  ans = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=null) ans.add(arr[i]);
        }
        return ans;   
    }
    public void bfs ( ArrayList<Integer> [] arr , TreeNode node , int col){

      HashMap< TreeNode , Integer> map = new HashMap<>();
      map.put(node , col);

      Queue<TreeNode> q = new ArrayDeque<>();
      q.add(node);
    
      while(!q.isEmpty()){
          TreeNode curr = q.poll();
          int c = map.get(curr); // column of curr Node 
          if(arr[c]==null) arr[c] = new ArrayList<>();
          arr[c].add(curr.val);
          
          if(curr.left!=null) { map.put(curr.left , c-1); q.add(curr.left); }
          if(curr.right!= null ) { map.put(curr.right , c+1); q.add(curr.right); }

      }

    }
}