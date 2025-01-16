class Solution:
    def maximalPathQuality(self, values: List[int], edges: List[List[int]], maxTime: int) -> int:

        graph = defaultdict(list)

        for u,v,t in edges:
            graph[u].append((v,t))
            graph[v].append((u,t))
        vst = []
        vst.append(0)
        m = [-10e9,  ]
        def dfs(curr, time ):
            if time > maxTime:
                return 
            if curr == 0 :
                m[0] = max(m[0] ,  sum( values[node] for node in set(vst)) )
            for nei , t  in graph[curr]:
                vst.append(nei)
                dfs(nei,time+t)
                vst.pop(-1)
            return 
        
        dfs(0,0)
        return m[0]


        