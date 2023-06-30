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
    public int getDecimalValue(ListNode head) {

        //https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/

        ListNode temp = head ;
        int len = 0;
        while(temp!=null){
            len ++;
            temp = temp.next;
        }
        int num = 0;
        temp = head ;
        for(int i=len-1 ; i>=0;i--){
            double index = i;
            double pow = Math.pow(2.0 , index);
            int val = temp.val;
            num += val * pow;
            temp = temp.next;
        }
        return (int)num;
        
    }
}