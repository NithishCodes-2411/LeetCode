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
    public int numComponents(ListNode head, int[] nums) {

      HashSet<Integer> set = new HashSet <>();
      for(int n : nums ) set.add(n);
      ///System.out.print(se.size());

      int ans = 0;
      int connected = 0;
      while(head!=null){
        if(set.contains(head.val)){
          connected++;
        }
        else{
          if(connected>0){
            ans++;
            connected = 0;
          }
        }
        head = head.next;
      }
      if(connected>0) ans++;
      return ans;


        

  
        
    }
}