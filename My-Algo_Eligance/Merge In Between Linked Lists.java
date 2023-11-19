class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        //https://leetcode.com/problems/merge-in-between-linked-lists/
        ListNode current = list1;
        ListNode prev = null;
        
        ListNode aprev = null;
        ListNode bafter = null;

        ListNode list2End = list2;
        while (list2End.next != null) {
            list2End = list2End.next;
        }

     
        for (int i = 0; i < a; i++) {
            prev = current;
            current = current.next;
        }
        
        aprev = prev;
     
        for (int i = a; i <= b; i++) {
            current = current.next;
        }
        
        bafter = current;

      
        aprev.next = list2;
        list2End.next = bafter;
        
        return list1;
    }
}
