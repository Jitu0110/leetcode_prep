// Time complexity is O(M*N)
// Space complexity is O(1)

class Solution {
    public int islandPerimeter(int[][] grid) {
        int row = grid.length; // Number of rows in the grid
        int col = grid[0].length; // Number of columns in the grid
        
        int perimeter = 0; // Initialize perimeter counter
        

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j] == 1){
                   perimeter+=4;
                    
                    if(i>0 && grid[i-1][j] == 1 ) perimeter-=2;
                    
                    if(j>0 && grid[i][j-1] == 1) perimeter-=2;
                    
                    System.out.println(perimeter);
                }
            }
        }
        
        return perimeter;
    }
}
