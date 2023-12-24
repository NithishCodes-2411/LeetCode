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
    HashMap <Integer  , Double> map = new HashMap <>();
    ArrayList <Double>  doub = new ArrayList<>();
    List<Integer> ans = new ArrayList<>();
    public List<Integer> closestKValues(TreeNode root, double target, int k) {
        sol(root , target);
        Collections.sort(doub);

        HashSet <Double> set = new HashSet <>();
        for(int i=0; i<k; i++){
            set.add(doub.get(i));
        }
        sol2(root , set , target);
       
        
        return ans;
        
  


        
    }
    public void sol (TreeNode root , double t){
        if(root!=null){
            sol(root.left , t);
            double d = Math.abs(t - root.val);
            map.put(root.val , d);
            doub.add(d);   
            sol(root.right , t);
        }
}
    public void sol2 (TreeNode root , HashSet<Double> set , double t){
        if(root!=null){
            sol2(root.left , set , t);
            double d = Math.abs(root.val - t );
            if(set.contains(d)){
                ans.add(root.val);
            }
            sol2(root.right , set , t)
;
        }
    }
}