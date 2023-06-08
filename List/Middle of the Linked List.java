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
    public ListNode middleNode(ListNode head) {
        
        ListNode node = head;
        ListNode temp = head;
        int listSize = 0, index = 1;
        while (node != null) {
            listSize++;
            node = node.next;
        }
        System.out.println(listSize);
        int middleIndex = (listSize / 2) + 1;
        while (index != middleIndex) {
            temp = temp.next;
            index++;
        }
        return temp;
    }
}