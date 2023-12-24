/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/

class Solution {
    ArrayList <Node> nodes = new ArrayList<>();
    public Node treeToDoublyList(Node root) {
        if(root == null){ return null;}
        travs(root);
        Node head = nodes.get(0);
        Node curr = head;
        if(nodes.size()>1){
            for(int i=1; i < nodes.size();i++ ){
                Node n = nodes.get(i);
                n.left = curr;
                curr.right = n;
                curr = curr.right;
            }
            curr.right = head;
            head.left = curr;
            return head;
        }
        else{
            head.left  = head;
            head.right = head;
            return head;
        }
   
    }
    public void travs (Node root){
        if(root!=null){
            travs (root.left);
            nodes.add(root);
            travs(root.right);
        }
    }
}