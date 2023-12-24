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
    public int[] nextLargerNodes(ListNode head) {

        ListNode curr = head;
        int count = 0;
        while(curr!=null){
            count++;
            curr = curr.next;
        }
        int [] ans = new int [count];
        int i = 0;
        curr = head;
        while(curr!=null){

            ListNode temp = curr;
            // System.out.println(temp.val);
            boolean brk = false;
            while(temp!=null){
                // System.out.print(temp.val+" ");
                if(temp.val>curr.val) {
                    System.out.print(temp.val+" ");
                    ans[i] = temp.val;
                    break; 
                }
                temp = temp.next;
            }
            System.out.println();
            curr = curr.next;
            i++;
        }
        return ans;


        
    }
}