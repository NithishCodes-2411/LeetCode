class Solution {
    public int countCompleteComponents(int n, int[][] edges) {

      HashMap<Integer , List<Integer> > cc = new HashMap<>(); // conected cmps
      HashMap<Integer , HashSet<Integer> > adj = new HashMap<>();
      ArrayList <Integer> list = new ArrayList<>();
       for(int [] e : edges ){
        int a = e[0];
        int b = e[1];
        adj.computeIfAbsent( a , val -> new HashSet<>()).add(b);
        adj.computeIfAbsent( b , val -> new HashSet<>()).add(a);
      } 
     
      boolean vst [] = new boolean [n];
      for(int i=0; i<vst.length; i++){
        if(!vst[i]){
          list.add(i);
          ArrayList <Integer> path = new ArrayList<>();
          dfs(adj , vst , i , path );
          cc.put(i , path );
          
        }
      }
      int ans  = 0;
      for(int i=0;i<list.size(); i++){
        List<Integer> g = cc.get(list.get(i));
        int edge = 0;
        if(g!=null && (g.size() == 1 ||  g.size()== 0)  )  { ans++ ; continue ;}
      
        for(int j=0;  j<g.size(); j++ ){
             edge+= adj.get(g.get(j)).size();
        }
        edge = edge/ 2;
        int m = g.size();
        if(edge == m*(m-1)/2 ) ans++;
      }
      return ans;
          
    }
    public void dfs(HashMap<Integer , HashSet<Integer> > adj , boolean vst [] , int src , ArrayList<Integer> path  ){
          vst[src] = true;
          path.add(src);
          if(adj.get(src) == null )return ;
          for(Integer v : adj.get(src)) {
            
            if(vst[v] == false ) {
              //  path.add(v);
               dfs(adj , vst , v , path );
            }
          }
    }

}