class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        int n = grid.length;
        n = n*n;
        int arr [] = new int [n+1];
        
        //ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<grid.length; i++){
            for(int j=0;j <grid[i].length; j++){
                arr[ grid[i][j] ]++;
                //list.add(grid[i][j]);
            }
        }
        int ans [] = new int [2];
        for(int i=0; i<arr.length; i++){
            //System.out.print(arr[i] + " ");
            if(arr[i]==0) ans[1]=i;
            if(arr[i]>1) ans[0]=i;
        }
        return ans;
              
    }
}