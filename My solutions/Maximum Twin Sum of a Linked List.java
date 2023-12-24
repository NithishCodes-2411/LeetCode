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
    public int pairSum(ListNode head) {

        ArrayList <Integer> sum  = new ArrayList <>();
        while(head!=null){
            sum.add(head.val);
            head = head.next;
        }
        int n= sum.size();
        int summ = 0;
        for(int i=0; i<n/2; i++){
            summ = Math.max(summ ,  sum.get(i)+ sum.get(n-1-i)); 
        }
        return summ;

         



        
    }
}