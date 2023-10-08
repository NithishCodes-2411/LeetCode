class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        if(words.length==0) return 0;
        //List<String> arrayList = new ArrayList<>(Arrays.asList(words));
        Set<String> set = new HashSet<>(Arrays.asList(words));
        int sameWord = 0;
        for(int i=0;i<words.length; i++){
             StringBuilder reversedString = new StringBuilder(words[i]).reverse();
             if(words[i].equals(reversedString.toString())){
                 sameWord++;
             }

            words[i]= reversedString.toString();
        }
        set.addAll(Arrays.asList(words));
        int output = (words.length*2)-(set.size()+sameWord);
        return output/2;

       
        


      

        
        
        
    }
}