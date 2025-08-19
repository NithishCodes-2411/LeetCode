class Solution:
    def asteroidCollision(self, asteroids: List[int]) -> List[int]:

        stack = []

        for a in asteroids :
            alive = True 

            while alive and stack and stack[-1] > 0 and a < 0:

                top = stack[-1]

                if abs(top) < abs(a):
                    stack.pop()
                    continue
                elif abs (top) == abs(a):
                    stack.pop()
                    alive  = False
                else:
                    alive = False
            
            if alive :
                stack.append(a)
        
        return stack



        
        