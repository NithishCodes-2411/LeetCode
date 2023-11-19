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
    public ListNode doubleIt(ListNode head) {

        if(head == null ) return null;

        ListNode curr = reverse(head);
        ListNode ans = curr;
        int carry = 0;
        ListNode prev = null;
        while (curr!=null){
            int prod = (curr.val*2) + carry;
            carry = 0;
            if(prod<10){curr.val = prod;}
            else if(prod == 10){
                curr.val = 0;
                carry  = 1;
            }
            else{
                curr.val = prod%10;
                carry = prod / 10;
            }
            prev = curr;
            
            curr = curr.next;
           
        }
        System.out.println(carry);
        if(carry>0){
            prev.next = new ListNode (carry , null); 
        }
       
        return reverse(ans);
            
    }
    public ListNode reverse(ListNode head ){
        ListNode curr = head;
        ListNode prev = null;
        //ListNode next = head.next;

        while(curr!=null){
           ListNode  next = curr.next;
            curr.next  = prev;
            prev= curr;
            curr = next;
        }
        return prev;
    }
}