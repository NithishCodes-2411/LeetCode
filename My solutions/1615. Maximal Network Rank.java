class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {

      HashMap <Integer , HashSet<Integer> > adj = new HashMap<>();
       int ind [] = new int [n];

      for(int i=0; i<roads.length; i++){
        adj.computeIfAbsent( roads[i][0] , val -> new HashSet<Integer>() ).add( roads[i][1] );
        adj.computeIfAbsent( roads[i][1] , val -> new HashSet<Integer>() ).add( roads[i][0] ) ;
          ind[roads[i][0]]++;
          ind[roads[i][1]]++;
      } 


      int ans = 0;
      for(int i=0; i<n; i++){
        for(int j=i+1; j<n; j++){
           int rank = ind[i] + ind[j];
           int common = 0;
           if( adj.get(i)!=null && adj.get(i).contains(j) || adj.get(j)!=null && adj.get(j).contains(i) ){
               common = 1;
           }
           ans = Math.max( ans , rank - common );
        }
      }
      return ans;
      
 




        
    }
}