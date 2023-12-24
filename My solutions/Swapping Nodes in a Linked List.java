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
    public ListNode swapNodes(ListNode head, int k) {

        ListNode curr = head;
        int count = 0;
        ArrayList <Integer> list = new ArrayList<>();
        while(curr!=null){
            count++;
            list.add(curr.val);
            curr = curr.next;
        }
        int frst = list.get(k-1);
        int scnd = list.get(count -k);

        list.set(k-1,scnd);
        list.set(count-k,frst);
        ListNode h = new  ListNode(list.get(count-1));
       

        for(int i=count-2; i>=0; i--){
            ListNode nn = new ListNode(list.get(i) , h );
            h = nn;
        }
        return h;


     

       

        



    
        
    }
}