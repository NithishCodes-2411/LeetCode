class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.length()==0) return 0;

        int start =0; int end =0;
        int windowLen = 1;

        Set <Character> seen = new HashSet <> ();
        while(end<s.length())
        {
            char c = s.charAt(end);

            while(seen.contains(c))
            {
                seen.remove(s.charAt(start));
                start++;
            }

            seen.add(c);

            windowLen = Math.max(windowLen , seen.size());
            end++;
        }
return windowLen;
    }   

}