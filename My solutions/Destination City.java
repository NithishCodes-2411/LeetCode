class Solution {
    public String destCity(List<List<String>> paths) {

        HashSet <String> dest = new HashSet<>();
        for(int i=0; i<paths.size(); i++){
            dest.add(paths.get(i).get(0));
        }
       
        for(int i=0; i<paths.size(); i++){
        if(!dest.contains(paths.get(i).get(1))) return paths.get(i).get(1) ;
        }
        return null;

        
    }
}