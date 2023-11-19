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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null) return head;

        ListNode prev = head;
        ListNode curr = head.next;

        while(curr!=null){
            prev.next = new ListNode (gcd ( prev.val , curr.val) , curr);
            prev = prev.next.next;
            curr = curr.next;
        }
        return head;
    }


 public int gcd(int a, int  b){
    while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
}
}