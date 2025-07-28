class Solution:
    def numRookCaptures(self, board: List[List[str]]) -> int:

        rook_cords = []
        for r in range(8):
            for c in range(8):
                if board[r][c] == "R":
                    rook_cords = [r,c]
                    break


        count = 0 
        
        #left 
        for c in range(rook_cords[1],-1,-1):
            r =  rook_cords[0]
            if board[r][c] == "B":
                break
            if board[r][c] == "p":
                count = count+1
                break
        # right 
        for c in range(rook_cords[1],8):
            r =  rook_cords[0]
            if board[r][c] == "B":
                break
            if board[r][c] == "p":
                count = count+1
                break
        
        # up 
        for r in range(rook_cords[0] , -1 , -1):
            c = rook_cords[1]

            if board[r][c] == "B":
                break
            if board[r][c] == "p":
                count = count +1
                break


        # down
        for r in range(rook_cords[0] , 8):
            c = rook_cords[1]

            if board[r][c] == "B":
                break
            if board[r][c] == "p":
                count = count +1
                break
        
        return count
            

        


        
        