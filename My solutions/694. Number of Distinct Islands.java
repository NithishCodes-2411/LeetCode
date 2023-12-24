class Solution {
    HashSet <String> diffIsland = new HashSet<>();
    public int numDistinctIslands(int[][] grid) {

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                  if(grid[i][j] == 1){
                      bfs(i , j , grid);
                  }
            }
        }
        return diffIsland.size();
        
    }
    public void bfs (int i , int j , int[][]grid){
        int topi = i;
        int topj = j;
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{i,j});
        String island = "";

        while(!q.isEmpty()){
            int [] curr = q.poll();
            int row = curr[0];
            int col = curr[1];
            grid[row][col] = 0;
            String land = (row-topi) + "," + (col - topj) + " ";
            island += land;
            try{ if(grid[row+1][col] == 1){ q.add(new int[]{row+1,col}); grid[row+1][col]=0;} }catch (Exception e){}
            try{ if(grid[row-1][col] == 1){ q.add(new int[]{row-1,col}); grid[row-1][col]=0;} }catch (Exception e){}
            try{ if(grid[row][col+1] == 1) {q.add(new int[]{row,col+1}); grid[row][col+1]=0;} }catch (Exception e){}
            try{ if(grid[row][col-1] == 1) {q.add(new int[]{row,col-1}); grid[row][col-1]=0;} }catch (Exception e){}
        }
        
        diffIsland.add(island);
    }
}