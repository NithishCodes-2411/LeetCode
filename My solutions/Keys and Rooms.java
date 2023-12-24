class Solution {
    
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        boolean [] seen = new boolean [rooms.size()] ;
        
        Queue<Integer> q = new ArrayDeque<>();
        seen[0] = true;
        q.add(0);
        while(!q.isEmpty()){
            int curr = q.poll();
            for(int nextnode : rooms.get(curr)){
                if(seen[nextnode] == false){
                    seen[nextnode] = true;
                    q.add(nextnode);
                }
            }
        }
        for(int i=0; i<seen.length; i++){
            if(!seen[i]) return false;
        }
        return true;
        

        
    }
    
}