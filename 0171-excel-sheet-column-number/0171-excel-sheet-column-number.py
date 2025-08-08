class Solution:
    def titleToNumber(self, s: str) -> int:

        alpha_map = { chr(i+65) :  i +1 for i in range(26)}

        n = len(s)
        res = 0
        for i in range(n):
            cur_char = s[n-1-i]
            res += alpha_map[cur_char] * (26**i)
        return res


        
        