class Solution:
    def canCross(self, stones: List[int]) -> bool:
        


        stone_set = set(stones)
        last_stone = stones[-1]


        memo = set()

        # stones = [0, 1,3,-> 5,6,->8,12,17]
        # dfs (3 , 2)
        def dfs(pos,jump):


            if (pos,jump) in memo:
                return False

            if pos == last_stone:
                return True
            

            for next_jump in [jump-1,jump,jump+1]:
                if next_jump > 0 and (pos + next_jump ) in stone_set:
                    if dfs(pos+next_jump , next_jump):
                        return True 
            memo.add((pos,jump))

            return False
        
        return dfs(0,0)