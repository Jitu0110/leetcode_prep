class Solution {
    int count = 0;
    
    public int maxAreaOfIsland(int[][] grid) {
        
        int row = grid.length;
        int col = grid[0].length;
        
        if(row ==0 || col == 0){
            return 0;
        }
        
        boolean[][] visited = new boolean[row][col];
        int maxArea = 0;
        
        for(int i =0; i<row; i++){
            for(int j=0; j<col;j++){
                if(grid[i][j]==1 && !visited[i][j]){
                    dfs(grid,i,j,visited);
                    maxArea = Math.max(maxArea,count);
                    count = 0;
                }
            }
        }
        
        return maxArea;
        
    }
    
    private void dfs(int[][] grid, int x, int y, boolean[][] visited) {
        int row = grid.length;
        int col = grid[0].length;
        if (x < 0 || x >= row || y < 0 || y >= col || visited[x][y] || grid[x][y] == 0)
            return;

        visited[x][y] = true;
        count++;

        dfs(grid, x + 1, y, visited);
        dfs(grid, x - 1, y, visited);
        dfs(grid, x, y + 1, visited);
        dfs(grid, x, y - 1, visited);
    }
}