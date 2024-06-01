class Solution {
    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        
        int fresh = 0;
        int time = 0;
        Queue<int[]> queue = new LinkedList<>();
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        
        for(int i =0; i<row; i++){
            for(int j =0; j<col;j++){
                if(grid[i][j]==1){
                    fresh+=1;
                }
                
                if(grid[i][j]==2){
                    queue.offer(new int[]{i,j});
                }
            }
        }
        
        
        while(!queue.isEmpty() && fresh>0){
                 
            time += 1;
            int size = queue.size();
            
            for(int x = 0; x <size; x++){
                int[] top = queue.poll();
                int r = top[0];
                int c = top[1];
                
                for(int[] dir : directions){
                    int newRow = r + dir[0];
                    int newCol = c + dir[1];
                    
                    if(newRow>=0 && newRow<row && newCol>=0 && newCol<col && grid[newRow][newCol] == 1 ){
                        grid[newRow][newCol] = 2;
                        queue.offer(new int[]{newRow,newCol});
                        fresh-=1;
                    }
                }
            }
            
        }
        
        return fresh == 0 ? time : -1;
    }

}