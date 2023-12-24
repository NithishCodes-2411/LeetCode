// class Solution {

//     public List<Integer> numIslands2(int m, int n, int[][] positions) {
//          char [] [] grid = new char [m][n];
//          System.out.print(m + " " + n);
//          for(int i=0; i<m; i++){
//            for(int j=0; j<n; j++){
//              grid[i][j] = '0';
//            }
//          }
//          ArrayList<Integer> ans = new ArrayList<>();
//          for(int i=0; i<positions.length; i++){
//             int k = positions[i][0];
//             int j = positions[i][1];
//             grid[k][j] = '1';
//             ans.add(numIslands (grid));
//          }
//          return ans; 
   
         
//     }
//     public int numIslands(char[][] grid) {

//       int ans = 0;
//       boolean [][] vst = new boolean [grid.length][grid[0].length];
//       for(int i=0; i<grid.length; i++){
//         for(int j=0; j<grid[i].length; j++){
//           if(grid[i][j]=='0') vst[i][j] = true;
//         }
//       }

//       for(int i=0; i<grid.length; i++){
//         for(int j=0; j<grid[i].length; j++){
//           if(!vst[i][j] ){
//             ans ++;
//             dfs( grid , vst , i , j );
//           }
//         }
//       }
      
//       return ans;
        
//     }
//     public void dfs(char [][] grid , boolean [][]vst , int i , int j){
//       if ( !(i>=0 && j>=0) ) return ; 
//       if ( !(i<grid.length && j<grid[i].length) ) return;
//       if(vst[i][j])  return ;
//       vst[i][j] = true;
//       dfs( grid , vst , i , j+1 );
//       dfs( grid , vst , i , j-1 );
//       dfs( grid , vst , i+1 , j );
//       dfs( grid , vst , i-1 , j );
//     }

// }
class Solution {
    public List<Integer> numIslands2(int m, int n, int[][] positions) {
       
        List<Integer> ans =new ArrayList<>();
        int[] rank=new int[m*n];
        int[] par=new int[m*n];
        int[][] dirs={{1,0},{0,-1},{-1,0},{0,1}};
        Arrays.fill(par,-1);
        int count=0;

        for(int i=0;i<positions.length;i++){
            int row=positions[i][0];
            int col=positions[i][1];

            int cellno=row*n+col;
            if(par[cellno]!=-1){
                ans.add(count);
                continue;
            }
            par[cellno]=cellno;
            rank[cellno]=1;
            count++;

            for(int dir[]:dirs){
                int rowdash=row+dir[0];
                int coldash=col+dir[1];
                int celldash=rowdash*n+coldash;

                if(rowdash<0 || rowdash>=m || coldash<0 ||coldash>=n 
                || celldash>=(m*n+n) || par[celldash]==-1){
                    continue;
                }
                int lx=find(cellno,par);
                int ly=find(celldash,par);

                if(lx!=ly){
                    if(rank[lx]>rank[ly]){
                      par[ly]=lx;
                    }else if(rank[lx]<rank[ly]){
                        par[lx]=ly;
                    }else{
                        par[ly]=lx;
                        rank[lx]++;
                    }
                    count--;
                }


            }
            ans.add(count);

        }
        return  ans;
    }
    public static int find(int x,int[] par){
        if(par[x]==x){
            return x;
        }
        int temp=find(par[x],par);
        par[x]=temp;
        return temp;
    }
}