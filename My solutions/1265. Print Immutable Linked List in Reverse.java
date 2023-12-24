/**
 * // This is the ImmutableListNode's API interface.
 * // You should not implement it, or speculate about its implementation.
 * interface ImmutableListNode {
 *     public void printValue(); // print the value of this node.
 *     public ImmutableListNode getNext(); // return the next node.
 * };
 */

class Solution {
    Stack <ImmutableListNode> s = new Stack<>();
    public void printLinkedListInReverse(ImmutableListNode head) {

      helper(head);
      while(!s.isEmpty()){
        s.pop().printValue();
      }
    
    }
    public void helper (ImmutableListNode head){
        if(head!=null){
            s.push(head);
            helper(head.getNext());
        }
    }
}