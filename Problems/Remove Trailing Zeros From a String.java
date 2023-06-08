class Solution {
    public String removeTrailingZeros(String num) {

        int n = num.length();


        for(int i= n-1; i>=0; i--){
            if(num.charAt(i)=='0'){
                 num = num.substring(0, num.length() - 1);    
            }
            else{
                return num;
            }
        }
        return num;

    }
}
        
    
