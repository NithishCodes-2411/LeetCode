class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode s_head = new ListNode(0);
        ListNode small = s;
        ListNode b_head = new ListNode(0);
        ListNode big = b;

        while (head != null) {
            if (head.val < x) {
                small.next = head;
                small = small.next;
            } else {
                big.next = head;
                big = big.next;
            }
            head = head.next;
        }

        big.next = null;
        small.next = b_head.next;

        return s_head.next;
    }
}