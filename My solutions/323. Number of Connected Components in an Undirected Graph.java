class Solution {
      int rank [] ;
      int parent [];
    public int countComponents(int n, int[][] edges) {
      rank = new int [n+1];
      parent = new int [n+1];
      for(int i=0; i<parent.length; i++) parent[i]=i;
      for(int [] e : edges ) union (e[0] , e[1]);
      int ans =0;
      for(int i=0; i<parent.length; i++) if(parent[i]==i)ans++;
      return ans-1;     
    }
    
    public int findParent (int u){
      if(u==parent[u]) return u;
      return findParent(parent[u]);
    }

     public void union(int u  , int v){
      int uParent = findParent(u);
      int vParent = findParent(v);
      parent[uParent] = parent[vParent];
    }



    
}