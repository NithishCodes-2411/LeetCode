/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    ArrayList <Integer> list = new ArrayList<>();
    public TreeNode sortedListToBST(ListNode head) {

        ListNode curr = head;
        while(curr!=null) {
            list.add(curr.val);
            curr = curr.next;
        }
        if(list.size()<1) return null;
        return sol(0 , list.size()-1);
        
        
    }
    public TreeNode sol(int left , int right ){

        int mid = (right + left ) /2;
        TreeNode root = new TreeNode ( list.get(mid ) );
        if(mid > left ){
            root.left = sol( left , mid-1);
        }
        if(right > mid ) {
            root.right = sol(mid +1 , right);
        }
        return root;

    }

}