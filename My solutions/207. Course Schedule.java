class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
    HashMap<Integer , ArrayList<Integer> > adj = new HashMap<>();

      for(int [] e : prerequisites){
        int a = e[0];
        int b = e[1];

        adj.computeIfAbsent( a , val -> new ArrayList<>()).add(b);
        adj.computeIfAbsent( b , val -> new ArrayList<>()).add(a);
      }
      int [] pred = new int [numCourses];
      for(int i=0; i<prerequisites.length ; i++){
          pred [prerequisites[i][0]]++;
      }
      Queue <Integer> q = new ArrayDeque<>();
      for(int i=0; i<pred.length; i++) {
          if(pred[i]==0) q.add(i);
      }
      if(q.isEmpty()) return false;
      List<Integer> topNum = new ArrayList<>();

      while(!q.isEmpty()){

        int w = q.poll();
        topNum.add(w);
        for(int i=0;adj.get(w)!=null &&  i<adj.get(w).size(); i++ ){
          pred [adj.get(w).get(i)]--;
          if(pred[adj.get(w).get(i)] == 0) q.add(adj.get(w).get(i));
        }
      }

      return topNum.size() == numCourses;

   

        
    }
}