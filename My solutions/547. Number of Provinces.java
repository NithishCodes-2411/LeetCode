class Solution {
    public int findCircleNum(int[][] isConnected) {

      boolean  vst [] = new boolean  [isConnected.length];
      HashMap <Integer , HashSet<Integer> > adj = new HashMap <>();
      for(int i=0;i <isConnected.length; i++){
        for(int j=0; j < isConnected.length; j++){
          if(isConnected[i][j] == 1 && i!=j) {
             adj.computeIfAbsent( i , val ->new HashSet<Integer>()  ).add(j);
          }
        }
      }
      //System.out.print(adj);
      int ans =0;
      for(int i=0; i<vst.length ; i++){
         if(!vst[i]){
           ans++;
           dfs(adj , vst , i);
         }
      }
      return ans;
         
    }

    public void dfs(HashMap <Integer , HashSet<Integer> > adj , boolean [] vst , int src){
      vst[src] = true;
      if(adj.get(src) == null ) return ;
      for( Integer v : adj.get(src) ){
        if(vst[v] == false )dfs(adj , vst , v);
      }
      return ;
    }
}