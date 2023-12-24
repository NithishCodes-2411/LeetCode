class Solution {
    int[][] grid;

    public int[][] largestLocal(int[][] grid) {
        this.grid = grid;

        int rows = grid.length;
        int cols = grid[0].length;

        int[][] local = new int[rows - 2][cols - 2];

        for (int i = 0; i < rows - 2; i++) {
            for (int j = 0; j < cols - 2; j++) {
                local[i][j] = findMax(i, j);
            }
        }

        return local;
    }

    public int findMax(int x, int y) {
        int max = 0;
        int rows = x + 3;
        int cols = y + 3;

        for (int i = x; i < rows; i++) {
            for (int j = y; j < cols; j++) {
                if (grid[i][j] > max)
                    max = grid[i][j];
            }
        }

        return max;
    }
}
