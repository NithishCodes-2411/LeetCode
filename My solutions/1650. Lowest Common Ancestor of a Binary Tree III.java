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
    public Node lowestCommonAncestor(Node p, Node q) {

        ArrayList<Node> ppath = new ArrayList<>();
        HashSet<Node> qpath = new HashSet<>();

        while(p!=null){
            ppath.add(p);
            p = p.parent;
        }
        while(q!=null){
            qpath.add(q);
            q = q.parent;
        }
        for(int i=0; i<ppath.size(); i++){
            if(qpath.contains(ppath.get(i))) { return ppath.get(i); }
        }
        return null;
        
    }
}