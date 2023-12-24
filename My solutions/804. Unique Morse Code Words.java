class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        ArrayList<String> a=new ArrayList<>();
        String b[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(int i=0;i<words.length;i++)
        {
            String t="";
            for(int j=0;j<words[i].length();j++)
            {                
                t+=b[words[i].charAt(j)-97];                
            }
            if(!a.contains(t))
            {
                a.add(t);
            }
        }        
        return a.size();
    }
}