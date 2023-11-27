/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class Solution {
    Node parent = null;
    ArrayList<Node> nodes = new ArrayList<>();
    int ans = 0;
    public Node inorderSuccessor(Node node) {
        
        findParent(node);
        sol(parent , node);

        for(int i=0; i<nodes.size(); i++){
            if(nodes.get(i).val == node.val){
                try{
                    return nodes.get(i+1);
                }
                catch(Exception e) {  return null; }
            }
        }
        return null;
  

       

        
    }
    public void findParent  (Node node){
        if(node!=null){
            if(node.parent == null) this.parent = node;
            else findParent(node.parent);
        }
    }
    public void sol(Node root , Node n){
        if(root!=null){
            sol(root.left , n);
            nodes.add(root);
            sol(root.right , n);
        }
    }


}