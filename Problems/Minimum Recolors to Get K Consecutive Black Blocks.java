class Solution {
    public int minimumRecolors(String blocks, int k) {

        String [] b = blocks.split("");
        //for(String x : b) System.out.println(x);

        int start ;
        int end = k;
        int ans = Integer.MAX_VALUE;

        for(int i =end; i<=b.length; i++)
        {
            start = i-k;
            int count = 0;
            for(int j=start ; j<i; j++){
                if(b[j].equals("W")) count++;
                //System.out.print(b[j]);
            }
            //System.out.println();
            ans = Math.min(ans , count );
            //if()
        }
        return ans;
        
    }
