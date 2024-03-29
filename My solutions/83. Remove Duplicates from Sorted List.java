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
    public ListNode deleteDuplicates(ListNode head) {
        
//https://leetcode.com/problems/remove-duplicates-from-sorted-list/        

        if(head ==null){
            return head;
        }
        ListNode current = head.next;
        ListNode prev = head;
        while(current!=null){
            if(current.val==prev.val){
                prev.next  = current.next;
                current = current.next;
                continue;
            }
            else{
                prev = current;
                current = current.next;
            }
            
        }
        return head;

        
        
    }
}