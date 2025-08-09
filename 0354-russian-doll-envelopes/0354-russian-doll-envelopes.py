import bisect
class Solution:
    def maxEnvelopes(self, envelopes: List[List[int]]) -> int:
        """
            width and height cant be 0
            envelopes length => 1 -> 10^5
            input not sorted.

           env = [[5,4],[6,4],[6,7],[2,3]]
           [2,3] [5,4][6,7][6,5] [7,6]

           lis =[3 , 4 ,7 x]

        """

        envelopes.sort(key=lambda x : (x[0] , -x[1]))

        heights = [h for w,h in envelopes]

        lis = []

        for h in heights :
            idx = bisect.bisect_left(lis , h)

            if idx == len(lis):
                lis.append(h)
            else:
                lis[idx] = h
        return len(lis)