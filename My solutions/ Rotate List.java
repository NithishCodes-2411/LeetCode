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
public ListNode rotateRight(ListNode head, int k) {
    if (head == null || k == 0) {
        return head;
    }

    int length = 1; 
    ListNode current = head;
    while (current.next != null) {
        length++;
        current = current.next;
    }

    
    k = k % length;

    
    if (k == 0) {
        return head;
    }

   
    current.next = head;  
    current = head;
    for (int i = 0; i < length - k - 1; i++) {
        current = current.next;
    }

    
    ListNode newHead = current.next;
    current.next = null;

    return newHead;
}

}