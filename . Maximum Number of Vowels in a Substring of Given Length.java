class Solution {
    public int maxVowels(String s, int k) {

        
        int left =0;
        int maxV  = 0;
        int [] v = new int [5];

        for(int right=0; right<k; right++)
        {
    
           char c = s.charAt(right);
            if(c=='a') {v[0]++;}
            else if(c=='e') {v[1]++;}
            else if(c=='i') {v[2]++;}
            else if (c == 'o') {v[3]++;}
            else if (c == 'u') {v[4]++;}

        }
        maxV = Math.max( maxV , v[0]+v[1]+v[2]+v[3]+v[4]);

        for(int right = k; right<s.length(); right++)
        {
            char c = s.charAt(right);
            if(c=='a') {v[0]++;}
            else if(c=='e') {v[1]++;}
            else if(c=='i') {v[2]++;}
            else if (c == 'o') {v[3]++;}
            else if (c == 'u') {v[4]++;};

            c = s.charAt(left);
              if(c=='a') {v[0]--;}
            else if(c=='e') {v[1]--;}
            else if(c=='i') {v[2]--;}
            else if (c == 'o') {v[3]--;}
            else if (c == 'u') {v[4]--;}
            left++;

          maxV = Math.max( maxV , v[0]+v[1]+v[2]+v[3]+v[4]);
            
        }
        return maxV;

        

 
        
    }
}