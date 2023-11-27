// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
// //  *         this.val = val;
// //  *         this.left = left;
// //  *         this.right = right;
// //  *     }
// //  * }
// //  */
// class Solution {
//     public TreeNode buildTree(int[] preorder, int[] inorder) {

//         HashMap <Integer , Integer> map = new HashMap <>();
//         for(int i=0; i<inorder.length; i++){
//             map.put(inorder[i] , i);
//         }
//         return sol(preorder , map , 0 , 0 , inorder.length-1);
        
//     }
//     public TreeNode sol (int [] pre , Map <Integer , Integer> map , int rootpos , int left , int right  ) {
//         TreeNode root = new TreeNode ( pre [rootpos ] );
//         int mid = map.get(pre[rootpos]);
//         if(mid > left ){
//             root.left = sol(pre , map , rootpos+1 , left , mid-1 );
//         }
//         if(right > mid ){
//             root.right = sol(pre , map , rootpos + mid - left + 1 , mid + 1 , right );
//         }
//         return root;
//     }

// }



public class Solution {

  TreeNode buildTree(int[] preOrder, int[] inOrder) {

    Map<Integer, Integer> inOrderIndexMap = new HashMap<>();
    for (int i = 0; i < inOrder.length; i++)
      inOrderIndexMap.put(inOrder[i], i);

    return splitTree(preOrder, inOrderIndexMap,
        0, 0, inOrder.length - 1);
  }

  private TreeNode splitTree(int[] preOrder, Map<Integer, Integer> inOrderIndexMap,
                             int rootIndex, int left, int right) {

    TreeNode root = new TreeNode(preOrder[rootIndex]);

    // Create left and right subtree
    int mid = inOrderIndexMap.get(preOrder[rootIndex]);
    System.out.println(preOrder[rootIndex]);
    if (mid > left)
      root.left = splitTree(preOrder, inOrderIndexMap,
          rootIndex + 1, left, mid - 1);
    if (mid < right)
      root.right = splitTree(preOrder, inOrderIndexMap,
          rootIndex + mid - left + 1, mid + 1, right);
    return root;
  }

}