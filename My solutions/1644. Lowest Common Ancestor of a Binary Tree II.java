class Solution {
    // root = [3,5,1,6,2,0,8,null,null,7,4]
    // (5,1), (5,4), (5, 10) represent several diff cases
    int count = 0;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode res = dfs(root, p, q);
        return count == 2 ? res : null;
    }
    
    private TreeNode dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return root;
        TreeNode l = dfs(root.left, p, q);
        TreeNode r = dfs(root.right, p, q);
        // must calling l and r to get deeper into tree to continue search
        // can't directly return at the first line, otherwise example-2 p = 5, q = 4 won't work
        if (root == p || root == q) {
            count++; // need this for exampe-3 p =5, q = 10 case
            return root;
        }
        
        if (l != null && r != null) return root;
        return (l != null) ? l : r;
    }
}