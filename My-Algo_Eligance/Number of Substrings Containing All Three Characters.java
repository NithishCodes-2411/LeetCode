class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
        int[] charCount = new int[3];  // We'll use an array to count occurrences of a, b, and c
        int left = 0;  // Initialize the left pointer

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            // Update the character count for the current character
            if (currentChar == 'a') charCount[0]++;
            else if (currentChar == 'b') charCount[1]++;
            else if (currentChar == 'c') charCount[2]++;

            // Check if we have at least one occurrence of all characters a, b, and c
            while (charCount[0] > 0 && charCount[1] > 0 && charCount[2] > 0) {
                // Update the count by the number of valid substrings ending at the current position
                count += s.length() - right;

                // Move the left pointer to reduce the substring size
                char leftChar = s.charAt(left);
                if (leftChar == 'a') charCount[0]--;
                else if (leftChar == 'b') charCount[1]--;
                else if (leftChar == 'c') charCount[2]--;

                left++;
            }
        }

        return count;
    }
}
