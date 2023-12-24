class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
      
      HashMap <Integer , List<Integer> > adj = new HashMap<>();
      int [] pred = new int [numCourses];

      for(int i=0; i<prerequisites.length; i++){
        int a = prerequisites[i][1];
        int b = prerequisites[i][0];
        adj.computeIfAbsent(a,val-> new ArrayList<>() ).add( b);
        pred [ b ]++;
      }


      for(int i=0; i<pred.length; i++) System.out.print(pred[i] + " ");
      Queue <Integer> q = new ArrayDeque<>();
      for(int i=0;i<pred.length; i++) if(pred[i]==0) q.add(i);

      ArrayList<Integer> topnum = new ArrayList<>();
      if(q.isEmpty()) return new int[0] ;

      while(!q.isEmpty()){
        int w = q.poll();
        topnum.add(w);
        List<Integer> curr = adj.get(w);
        for(int i=0; curr!=null && i < curr.size(); i++){
          pred[curr.get(i)]--;
          if(pred[curr.get(i)] == 0) q.add( curr.get(i) );
        }
      }
      if(topnum.size() != numCourses) return new int [0];
      int []ans = new int [topnum.size()];
      for( int i=0; i<topnum.size(); i++) ans[i] = topnum.get(i);
      return ans;

      
      
        
    }
}