class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j] == 1) {
                   ans = Math.max(ans , bfs(new int[]{i , j} , grid ));
                }
            }
        }
        return ans;
    }
    public int bfs(int [] index , int [][] grid){

        int num = 0;
        Queue <int[]> q = new ArrayDeque<>();
        q.add(index);
        while(!q.isEmpty()){
            int curr [] = q.poll();
            num++;
            int i = curr[0];
            int j = curr[1];
            grid[i][j] = 0;
            try{
                if(grid[i+1][j]==1) q.add(new int[]{i+1 , j}); grid[i+1][j] = 0;  // i+1 , j
            }catch (Exception e){}
            try{
                if(grid[i-1][j]==1) q.add(new int[]{i-1 , j}); grid[i-1][j] = 0; //i-1 , j
            }catch (Exception e){}
            try{
                if(grid[i][j+1]==1) q.add(new int[]{i , j+1}); grid[i][j+1] = 0;  // i , j+1
            }catch (Exception e){}
            try{
                if(grid[i][j-1]==1) q.add(new int[]{i , j-1}); grid[i][j-1] = 0; //i , j-1
            }catch (Exception e){}
        }
        return num;
    }
}