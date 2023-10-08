class Solution {
    public int largestAltitude(int[] gain) {
        if(gain.length==0){
            return 0;
        }

        int output = 0;
        int altitude = 0;
        for(int i=0; i <gain.length; i++){
            altitude = altitude + gain[i];
            if(output<altitude){
                output = altitude;
            }
        }
        return output;
        
    }
}