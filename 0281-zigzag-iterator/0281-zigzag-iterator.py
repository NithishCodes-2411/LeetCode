class ZigzagIterator:

    def __init__(self, v1: List[int], v2: List[int]):
        self.nums = []
        self.i = 0

        n,m = len(v1),len(v2)
        i = 0
        while i < min(n , m):
            self.nums.append(v1[i])
            self.nums.append(v2[i])
            i = i+1
        while i < n:
             self.nums.append(v1[i])
             i = i+1
        while i < m :
            self.nums.append(v2[i])
            i = i+1
        
    def next(self) -> int:
        n = self.nums[self.i]
        self.i = self.i +1
        return n

    def hasNext(self) -> bool:
        return self.i < len(self.nums)

        

# Your ZigzagIterator object will be instantiated and called as such:
# i, v = ZigzagIterator(v1, v2), []
# while i.hasNext(): v.append(i.next())