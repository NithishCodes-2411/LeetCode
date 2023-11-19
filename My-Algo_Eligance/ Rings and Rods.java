class Solution {
    public int countPoints(String rings) {
        
                int[][] arr = new int[10][3];
        for(int i = 1;i<rings.length();i+= 2){
            char a = rings.charAt(i-1);
            int b = rings.charAt(i) - '0';
            int j = 2;
            if(a == 'R')
                j = 0;
            else if(a == 'G')
                j = 1;
            arr[b][j] = 1;
        }
        int count = 0;
        for(int i = 0;i<10;i++){
            int sum = 0;
            for(int j = 0;j<3;j++){
                sum += arr[i][j];
            }
            if(sum == 3)
                count++;
        }
        return count;
    
    }
}