class Solution:
    def findLongestChain(self, pairs: List[List[int]]) -> int:
        pairs.sort(key = lambda k:k[0])
        n = len(pairs)

        memo = {}
        def f(p , prev):

            if p == 0:
                return 1 if pairs[p][1] < prev else 0
            if (p,prev) in memo:
                return memo[(p,prev)]
                
            not_pick= f(p-1,prev)
            pick = 0

            if pairs[p][1] < prev:
                pick = 1 + f(p-1,pairs[p][0])
            memo[(p,prev)] =  max(pick,not_pick)
            return memo[(p,prev)]
        
        return f(n-1,10e9)

        