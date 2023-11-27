class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
         int [] ind = new int [n]; 
        for(List<Integer> l : edges){
             ind[l.get(1)]++;
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<ind.length; i++){
            if(ind[i]==0) ans.add(i);
        }
        return ans;
        
    }
}