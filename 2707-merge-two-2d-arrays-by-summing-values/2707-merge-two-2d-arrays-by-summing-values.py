class Solution:
    def mergeArrays(self, nums1: List[List[int]], nums2: List[List[int]]) -> List[List[int]]:

        res = []
        p1 , p2   = 0 , 0 

        while p1 < len(nums1) and p2 < len(nums2):
            print(p1,p2,res)
            id1 , val1 = nums1[p1]
            id2 , val2 = nums2[p2]
            
            if id1 == id2:
                res.append([id1 , val1+val2 ])
                p1 = p1+1
                p2 = p2+1
            elif id1 < id2 :
                p1 = p1+1
                res.append([id1,val1])
            else:
                p2 = p2+1
                res.append([id2,val2])
        
        while p1 < len(nums1):

            previd = res[-1][0]
            id1 , val1 = nums1[p1] 
            # if previd == id1:
            #     res[-1][1] = res[-1][1] + val1
            #     p1 = p1+1
            #     continue
            res.append([id1,val1])
            p1 = p1+1
        while p2 < len(nums2):

            previd = res[-1][0]
            id2 , val2 = nums2[p2] 
            # if previd == id2:
            #     res[-1][1] = res[-1][1] + val2
            #     p2 = p2+1
            #     continue
            res.append([id2,val2])
            p2 = p2+1
        
        return res


                    
                


        