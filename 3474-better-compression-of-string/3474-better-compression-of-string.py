class Solution:
    def betterCompression(self, compressed: str) -> str:

        i = 0

        n = len(compressed)
        hmap = {}

        while i < n:

            c = compressed[i]
            freq = ""
            if c.isalpha():

                
                i += 1

                while i < n and not compressed[i].isalpha():
                    freq+=compressed[i]
                    i+=1
                
            if c in hmap :
                hmap[c] = hmap[c] + int(freq)
            else:
                hmap[c] = int(freq)
        res = ""
        for c in sorted(hmap.keys()):
            res+=c
            res+=str(hmap[c])
        return res


                

                



        