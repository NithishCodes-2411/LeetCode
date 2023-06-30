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
    public ListNode mergeNodes(ListNode head) {

        //https://leetcode.com/problems/merge-nodes-in-between-zeros/

        ListNode ansHead = null;

        ListNode temp = head.next;
        int sum =0;


        while(temp!=null){
            if(temp.val!=0){//not equal to zero
                sum+=temp.val;
            }
            else if(temp.val==0){

                ListNode ans = new ListNode (sum);
                if(ansHead==null){
                    ansHead=ans;
                    sum =0;
                }
                else{
                    ans.next = ansHead;
                    ansHead = ans;
                    sum =0;
                }
        
            }
            temp = temp.next;
        }
        ListNode current = ansHead.next;
        ListNode prev = ansHead;
        ListNode next = null;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        ansHead.next = null;
        ansHead = prev;
        return ansHead;
       

        
    }
}