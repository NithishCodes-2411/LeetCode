class Solution {
    public int divisorSubstrings(int num, int k) {

        String n  = Integer.toString(num);
        int beauty = 0;
       
        for(int i=k; i<=n.length(); i++)
        {
            String subS = n.substring(i-k , i);
            int testNum = Integer.parseInt(subS);
            if(!subS.isEmpty() &&  testNum != 0 && num%testNum == 0 ){
                beauty++;
            }

        }
         return beauty;
        
    }
}
