class Solution:
    def firstUniqChar(self, s: str) -> int:
        hmap = defaultdict(list)
        for i,c in enumerate(s):
            hmap[c].append(i)
        print(hmap)
        res = set()
        for k in hmap:
            if len(hmap[k]) == 1:
                res = res.union(hmap[k])
        
        return -1 if len(res) == 0 else min(res)

        