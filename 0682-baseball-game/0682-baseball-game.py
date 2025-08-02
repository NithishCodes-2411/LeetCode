class Solution:
    """
        To perform any action => at max we need prev two number.

    """
    def calPoints(self, operations: List[str]) -> int:
        res = []

        for point in operations:
            if point == "+":
                res.append(res[-1] + res[-2])
            elif point == "D":
                res.append(res[-1]*2)
            elif point == "C":
                res.pop(-1)
            else:
                res.append(int(point))
        
        return sum(res)
            



        
        