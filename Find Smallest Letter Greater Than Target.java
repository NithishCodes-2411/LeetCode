class Solution {
    
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;

        while (left <= right) {
            int current = left + (right - left) / 2;
            
            if (letters[current] <= target) {
                left = ++current;
            } else {
                right = --current;
            }
        }

        if (left == letters.length) {
            return letters[0];
        }

        return letters[left];
    }
}