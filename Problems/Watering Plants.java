class Solution {
    public int wateringPlants(int[] plants, int capacity) {

        int steps  = 0;
        int fullCap = capacity;
        for(int i=0; i<plants.length; i++){

            if(plants[i]<=capacity){
                capacity = capacity - plants[i];
                steps++;
            }
            else{
                int refillStep = i + i + 1;
                steps += refillStep;
                capacity = fullCap - plants[i];

            }

        
        }
        return steps;

        
    }
}