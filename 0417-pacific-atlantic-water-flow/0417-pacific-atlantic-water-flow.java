class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        if (heights == null || heights.length == 0 || heights[0].length == 0)
            return result;

        int row = heights.length;
        int col = heights[0].length;
        
        boolean[][] pacificVisited = new boolean[row][col];
        boolean[][] atlanticVisited = new boolean[row][col];

        // DFS from the Pacific ocean
        
        //North
        for (int i = 0; i < row; i++) {
            dfs(heights, i, 0, Integer.MIN_VALUE, pacificVisited);
        }
        
        //West
        for (int j = 0; j < col; j++) {
            dfs(heights, 0, j, Integer.MIN_VALUE, pacificVisited);
        }

        // DFS from the Atlantic ocean
        
        //East
        for (int i = 0; i < row; i++) {
            dfs(heights, i, col - 1, Integer.MIN_VALUE, atlanticVisited);
        }
        
        //South
        for (int j = 0; j < col; j++) {
            dfs(heights, row - 1, j, Integer.MIN_VALUE, atlanticVisited);
        }

        // Add the correct cell to result
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (pacificVisited[i][j] && atlanticVisited[i][j]) {
                    List<Integer> cell = new ArrayList<>();
                    cell.add(i);
                    cell.add(j);
                    result.add(cell);
                }
            }
        }
        return result;
    }

    private void dfs(int[][] heights, int x, int y, int prevHeight, boolean[][] visited) {
        int row = heights.length;
        int col = heights[0].length;
        if (x < 0 || x >= row || y < 0 || y >= col || visited[x][y] || heights[x][y] < prevHeight)
            return;

        visited[x][y] = true;

        dfs(heights, x + 1, y, heights[x][y], visited);
        dfs(heights, x - 1, y, heights[x][y], visited);
        dfs(heights, x, y + 1, heights[x][y], visited);
        dfs(heights, x, y - 1, heights[x][y], visited);
    }

    }
