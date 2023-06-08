class Solution {
 
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index =0 ;
        if(ruleKey.equals("type")){ index =0;}
        else if(ruleKey.equals("color")){index =1;}
        else if(ruleKey.equals("name")){index=2;}

        int ans =0;
        for(int i=0; i<items.size(); i++){
            String check = items.get(i).get(index);
            if(check.equals(ruleValue)){ans++;}
        }
        return ans;

        }
}