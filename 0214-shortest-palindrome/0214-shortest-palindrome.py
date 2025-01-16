class Solution:
    def shortestPalindrome(self, s: str) -> str:


        def is_pal(S):
            return S == S[::-1]
            
        if is_pal(s):
            return s   
        n = len(s)
        for i in range(n-1,-1,-1):
            check = s[i:][::-1]+s
            if is_pal(check):
                return check 




        