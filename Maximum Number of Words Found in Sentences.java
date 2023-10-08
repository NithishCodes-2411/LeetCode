class Solution {
    public int mostWordsFound(String[] sentences) {

        int max = 0;

        for(int i=0; i<sentences.length; i++){
            int currentLength  = sentences[i].split(" ").length;

            if(currentLength > max){ max= currentLength;}
        }
        return max;
        
    }
}