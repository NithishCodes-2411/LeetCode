class Solution {
    public int smallestEvenMultiple(int n) {

        if(n%2==0 || n==0) return n;
        
        return n*2;
        
    }
}