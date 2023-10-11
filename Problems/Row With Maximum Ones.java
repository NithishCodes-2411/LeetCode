class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {


        int ans [] = new int [2];
        int count = 0;
        int index = 0;
        for(int i=0; i<mat.length; i++){
            int num = 0;
            for(int j=0; j<mat[i].length; j++){
                if(mat[i][j]==1)
                {
                    num++;
                }
            }
            if(num>count){
                count = num;
                index = i;
            }
        }
        ans [0] = index;
        ans [1] = count;
        return ans;
        

    

        
    }
}