class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
 
        int col [] = new int [grid.length]; // --
        
        for(int i=0; i<grid.length; i++){
            int max = Integer.MIN_VALUE;
            for(int j=0; j<grid[i].length; j++ ){
                max = Math.max(grid[i][j] , max);
            }
            col[i] = max;
        }
        int [] row = new int [grid[0].length];
        for(int j=0; j<grid.length; j++){
            int max = Integer.MIN_VALUE;
            for (int i=0; i<grid.length; i++){
                max = Math.max(max , grid[i][j]);
            }
            row [j] = max;
        }
        int ans = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid.length; j++){
                int sky =  Math.min(row[i] , col[j] );
                ans += sky - grid[i][j]; 
            }
        }
        // for(int i=0; i<grid.length; i++){
        //     System.out.print(row[i] + " ");
        // }
        // System.out.println();
        // for(int i=0; i<grid.length; i++){
        //     System.out.print(col[i] + " ");
        // }
        return ans;


        
    

        
    }
}