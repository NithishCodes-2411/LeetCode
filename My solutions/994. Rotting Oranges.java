class Solution {
    public int orangesRotting(int[][] grid) {
        
        Queue <int []> q = new ArrayDeque <>();
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length;j++ ){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
            }
        }
        if(q.isEmpty()){
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j]==1) return -1;
            }
        }
        return 0;
        }
        int ans = -1;
        while(!q.isEmpty()){
            int index = q.size();
           
            for(int k=0; k<index; k++){
                int [] curr = q.poll();
                
                 int i = curr[0];
                 int j = curr[1];
                 grid[i][j] = 2;
        
                 try{ 
                    if(grid[i+1][j]==1) q.add(new int []{i+1, j}); grid[i+1][j] = 2;
                   } catch(Exception e ){}
                 try{ 
                    if(grid[i-1][j]==1) q.add(new int []{i-1, j}); grid[i-1][j] = 2;
                   } catch(Exception e ){}
                 try{ 
                    if(grid[i][j+1]==1) q.add(new int []{i, j+1}); grid[i][j+1] = 2;
                    } catch(Exception e ){}    
                  try{ 
                     if(grid[i][j-1]==1) q.add(new int []{i, j-1}); grid[i][j-1] = 2;
                    } catch(Exception e ){}
            }
            ans++;
                
        }
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j]==1) ans = -1;
            }
        }
        return ans;
        
        
    }
}