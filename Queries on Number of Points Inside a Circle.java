class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {

        int ans [] = new int [queries.length];

        for(int i=0; i<queries.length; i++){
            int count = 0;
            
            for(int j=0; j<points.length; j++){
                double x2x1 = Math.pow(points[j][0] - queries[i][0],2);
                double y2y1 = Math.pow(points[j][1] - queries[i][1],2);
                double sum = x2x1 + y2y1;
                double len = Math.sqrt(sum);
                if(len <= queries[i][2]) count++;
            }
            ans[i] = count;

        }
        return ans;
        
    }
}