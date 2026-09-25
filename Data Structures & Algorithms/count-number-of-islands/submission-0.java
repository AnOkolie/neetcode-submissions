class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> queue = new ArrayDeque<>();
        boolean[][] seen = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!seen[i][j] && grid[i][j] == '1') {
                    count++;
                    seen[i][j] = true;
                    queue.add(new int[]{i, j});
                    while (!queue.isEmpty()) {
                        int[] num = queue.poll();
                        int row = num[0];
                        int col = num[1];
                        if (row + 1 < m && grid[row + 1][col] == '1' && !seen[row+1][col]) {
                            seen[row+1][col] = true;
                            queue.add(new int[]{row + 1, col});
                        }
                        if (row-1 >= 0 && grid[row-1][col] == '1' && !seen[row-1][col]) {
                            seen[row-1][col] = true;
                            queue.add(new int[]{row-1, col});
                        }
                        if (col + 1 < n && grid[row][col + 1] == '1' && !seen[row][col+1]) {
                            seen[row][col+1] = true;
                            queue.add(new int[]{row, col + 1});
                        }
                         if (col-1 >= 0 && grid[row][col-1] == '1' && !seen[row][col-1]) {
                            seen[row][col-1] = true;
                            queue.add(new int[]{row, col-1});
                        }
                    }
                }
            }
        }
        return count;
    }
}
