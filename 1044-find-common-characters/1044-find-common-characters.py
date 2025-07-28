class Solution:
    """
        List of hashmap to keep the count of each char in each word[i] in words.

        
        words = ["bella","label","roller"] ,  output =. ["e","l","l"]

        




    """
    def commonChars(self, words: List[str]) -> List[str]:

        char_count = list ()

        for word in words:
            temp = dict()
            for char in word:
                if char not in temp:
                    temp[char] = 0
                
                temp[char] = temp[char] +1
            
            char_count.append(temp)

        
        word = words[0]
        ans = []
        for char in word:

            is_present = True 

            for hash_map in char_count :
                if not is_present:
                    continue
                if char in hash_map and hash_map[char] > 0:
                    continue
                else:
                    is_present = False
            if is_present:

                for hash_map in char_count:
                    hash_map[char] = hash_map[char]-1
            
                ans.append(char)
        
        return ans









        