class Solution:
    """
        Number of edges can be of the range 1 to 10^4
        Number of paths can of the range 0 to 2* 10^4
            * edge case : numbers of paths == 0 
            * every garden has atmost 3 paths 
            * cycles should not matter here.
    """
    def gardenNoAdj(self, n: int, paths: List[List[int]]) -> List[int]:

        adj = [[] for _ in range(n)]

        for x,y in paths :
            adj[x-1].append(y-1)
            adj[y-1].append(x-1)
        
        res = [0] * n 
        
        for i in range(n):

            used = set(res[j] for j in adj[i])

            for f in range(1,5):
                if f not in used:
                    res[i] = f
                    break
        return res
        