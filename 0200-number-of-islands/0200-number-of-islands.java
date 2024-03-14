class Solution {
    public int numIslands(char[][] grid) {
        
        int col = grid[0].length;
        int row = grid.length;
        int islands = 0;
        boolean[][] visited = new boolean[row][col];
        
        for(int i=0; i<row; i++){
            for(int j=0;j<col;j++){
                if(grid[i][j] == '1' && visited[i][j] == false){
                    dfs(i,j,visited,grid);
                    islands++;
                }   
            }
        }
        return islands;
        
    }
    
    void dfs(int row, int col, boolean[][] visited,char[][] grid){
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
}