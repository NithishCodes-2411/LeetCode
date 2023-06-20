/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    //https://leetcode.com/problems/linked-list-cycle/ - Link to the problem
    public boolean hasCycle(ListNode head) {
       
        ListNode temp = head; //a Node whosse pointer points the previous NOde

        int count = 0;
       
        while(temp!=null){

            temp = temp.next;
            count ++;
            if(count==1){
                if(temp==head){
                    return true;
                }
            }
            ListNode check = head;
            for(int i=0;i<count;i++){
                
                if(temp==check){
                    return true;   
                }
                check = check.next;  
            }
            
        }
        return false;

        
    }
}