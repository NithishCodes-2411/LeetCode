class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        Map<Integer , List<Integer>> graph = new HashMap<>();
      
        for(int [] e : edges){
            int a = e[0];
            int b = e[1];
            graph.computeIfAbsent(a , val -> new ArrayList<Integer>()).add(b); 
            graph.computeIfAbsent(b , val -> new ArrayList<Integer>()).add(a); 
        }

        boolean [] seen = new boolean [n];
        seen[source] = true;
        Queue<Integer> q = new ArrayDeque<>();
        q.add(source);

        while(!q.isEmpty()){
            int curr = q.poll();
            if(curr==destination) return true;
            for(int nn : graph.get(curr)){
                if(!seen[nn]){{
                    seen[nn] = true;
                    q.add(nn);
                }}
            }

        }
        return false;

        


   
        

        
       
        

        

        
        
    }
}