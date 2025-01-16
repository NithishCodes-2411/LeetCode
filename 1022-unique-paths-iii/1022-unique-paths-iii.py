class Solution:
    def uniquePathsIII(self, grid: List[List[int]]) -> int:
        start, end = None, None
        row, col = len(grid), len(grid[0])
        empty_squares = 0

        
        for r in range(row):
            for c in range(col):
                if grid[r][c] == 1:
                    start = (r, c)
                elif grid[r][c] == 2:
                    end = (r, c)
                elif grid[r][c] == 0:
                    empty_squares += 1

        vst = [[False for _ in range(col)] for _ in range(row)]
        vst[start[0]][start[1]] = True

        def backtrack(r, c, steps):
            
            if (r, c) == end:
                return 1 if steps == empty_squares + 1 else 0

            paths = 0

            for dr, dc in ((0, 1), (1, 0), (0, -1), (-1, 0)):
                nr, nc = r + dr, c + dc

                if 0 <= nr < row and 0 <= nc < col:
                    if not vst[nr][nc] and grid[nr][nc] != -1:
                        vst[nr][nc] = True
                        paths += backtrack(nr, nc, steps + 1)
                        vst[nr][nc] = False  

            return paths

        return backtrack(start[0], start[1], 0)
