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
class Solution {

    public ListNode reverseList(ListNode head) {
        //https://leetcode.com/problems/reverse-linked-list/

        if(head == null) return null;

        ListNode prev = head;
        ListNode current = head.next;
        ListNode next = null;

        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current ;
            current = next;
        }
        head.next = null;//cutting down the circle  list
        head = prev;
        return head;

    }
    
    
}