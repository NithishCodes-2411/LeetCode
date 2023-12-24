class Solution {
   int rank [] ;
   int parent [];
  
    public int[] findRedundantConnection(int[][] edges) {
    
      rank = new int [edges.length+1];
      parent = new int [edges.length+1];
      for(int i=0; i<parent.length; i++) parent[i]=i;

      int ans [] = null;
      for(int i=0; i<edges.length; i++){
        int e [] = edges[i];
        int u = e[0];
        int v = e[1];
        boolean bool = union(u,v);
        if(!bool) {
          ans = e;
          break;
        }
      }
      return ans;
       
    }
    int findParent (int n){
      if(n==parent[n]) return n;
      return findParent(parent[n]);
    }
    boolean union(int u  , int v){
      int uParent = findParent(u);
      int vParent = findParent(v);
      if(uParent==vParent) return false;
      parent[uParent] = parent[vParent];
      return true;
    }
    
    
}
