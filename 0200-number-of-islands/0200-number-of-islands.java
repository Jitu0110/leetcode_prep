class Solution {
    public int numIslands(char[][] grid) {
        
        int col = grid[0].length;
        int row = grid.length;
        int islands = 0;
        boolean[][] visited = new boolean[row][col];
        
        for(int i=0; i<row; i++){
            for(int j=0;j<col;j++){
                if(grid[i][j] == '1' && visited[i][j] == false){
                    bfs(i,j,visited,grid);
                    islands++;
                }   
            }
        }
        return islands;
        
    }
    /*
    
    //DFS Function
   private void dfs(int row, int col, boolean[][] visited,char[][] grid){
        int rowsOfMatrix =  visited.length;
        int colsOfMatrix =  visited[0].length;
        if(row<0 || row == rowsOfMatrix || col < 0 || col == colsOfMatrix || visited[row][col] == true || grid[row][col] == '0'){
            return;
        }
        
        visited[row][col] = true;
        
        dfs(row+1,col,visited,grid);
        dfs(row-1,col,visited,grid);
        dfs(row,col+1,visited,grid);
        dfs(row,col-1,visited,grid);
    }
    */
    
        //BFS Function
        private void bfs(int row, int col, boolean[][] visited,char[][] grid ) {
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{row, col});
        visited[row][col] = true;
        
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int r = curr[0];
            int c = curr[1];
            
            for (int[] dir : directions) {
                int newRow = r + dir[0];
                int newCol = c + dir[1];
                
                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols &&
                    grid[newRow][newCol] == '1' && !visited[newRow][newCol]) {
                    queue.offer(new int[]{newRow, newCol});
                    visited[newRow][newCol] = true;
                }
            }
        }
       }
    
}