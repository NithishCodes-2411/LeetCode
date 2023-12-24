class Solution {
    public int countBattleships(char[][] board) {
        
        int ans = 0;
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j] == 'X') {
                    bfs(i,j,board);
                    ans++;
                }
            }
        }
        return ans;
        
    }
    public void bfs(int i, int j , char[][]board){

        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{i,j});

        while(!q.isEmpty()){
            int [] curr = q.poll();
            int row = curr[0];
            int col = curr[1];

            try{ if(board[row+1][col]=='X'){q.add(new int[]{row+1 ,col}); board[row+1][col]='.';}} catch(Exception e){}
            try{ if(board[row-1][col]=='X'){q.add(new int[]{row-1 ,col}); board[row-1][col]='.';}}catch(Exception e){}
            try{ if(board[row][col+1]=='X'){q.add(new int[]{row ,col+1}); board[row][col+1]='.';}}catch(Exception e){}
            try{ if(board[row][col-1]=='X'){q.add(new int[]{row ,col-1}); board[row][col-1]='.';}}catch(Exception e){}
        }


    }
}