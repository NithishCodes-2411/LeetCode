class Solution {

    public int numIslands(char[][] grid) {

      int ans = 0;
      boolean [][] vst = new boolean [grid.length][grid[0].length];
      for(int i=0; i<grid.length; i++){
        for(int j=0; j<grid[i].length; j++){
          if(grid[i][j]=='0') vst[i][j] = true;
        }
      }

      for(int i=0; i<grid.length; i++){
        for(int j=0; j<grid[i].length; j++){
          if(!vst[i][j] ){
            ans ++;
            backtrack( grid , vst , i , j );
          }
        }
      }
      
      return ans;
        
    }
    public void backtrack(char [][] grid , boolean [][]vst , int i , int j){
      if ( !(i>=0 && j>=0) ) return ; 
      if ( !(i<grid.length && j<grid[i].length) ) return;
      if(vst[i][j])  return ;
      vst[i][j] = true;
      backtrack( grid , vst , i , j+1 );
      backtrack( grid , vst , i , j-1 );
      backtrack( grid , vst , i+1 , j );
      backtrack( grid , vst , i-1 , j );
    }
}