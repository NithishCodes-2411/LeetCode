class Solution {
    int numOfv = 1;
    boolean cycle ;
    public boolean validTree(int n, int[][] edges) {

      HashMap < Integer , List<Integer> > adj= new HashMap<>();
      for(int i=0; i<edges.length; i++){
          int a = edges[i][0];
          int b = edges[i][1];
          adj.computeIfAbsent( a , val -> new ArrayList<>()).add(b);
          adj.computeIfAbsent( b , val -> new ArrayList<>()).add(a);
      }
      boolean vst [] = new boolean [n];
      dfs ( adj , vst , 0 , -1);
      return (numOfv==n) && !cycle ;
          
    }
    void dfs (HashMap < Integer,List<Integer>>adj,boolean vst [], int src , int p  ){
         vst [src] = true;
         if(adj.get(src) == null) return ;
         for(Integer w : adj.get(src) ){
           if(vst[w] && p!=w) this.cycle = true;
           if(!vst[w]){
             this.numOfv++;
             vst[w] = true;
             dfs ( adj , vst , w , src);
           }

         }

    }
}