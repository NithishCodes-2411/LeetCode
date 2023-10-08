class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {

        int xArr[] = new int [points.length];
        for(int i=0; i<points.length; i++){
            xArr [i] = points[i][0]; 
        }
        Arrays.sort(xArr);
        int ans = 0;
        for(int i=0;i<points.length-1; i++){
            int diff = Math.abs(xArr[i]-xArr[i+1]);
            if(diff>ans) ans = diff;
        }
        return ans;
        
    }
}