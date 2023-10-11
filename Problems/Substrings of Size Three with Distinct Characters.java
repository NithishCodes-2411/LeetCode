class Solution {
    public int countGoodSubstrings(String s) {



        int ans = 0;

        if(s.length() <3) return 0;

        Set <Character> good = new HashSet <> ();

        for(int i=2; i<s.length(); i++){
            good.add(s.charAt(i));
            good.add(s.charAt(i-1));
            good.add(s.charAt(i-2));
            if(good.size()==3) ans++;
            good.clear();
        }
        return ans;


    

        
    }
}