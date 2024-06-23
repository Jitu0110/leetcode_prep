class Solution {
    public int maximalRectangle(char[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[] heights = new int[col];
        int maxArea = 0;
        
        for(int i = 0; i < row; i++){
            for(int j=0; j < col; j++){
                if(matrix[i][j] == '1'){
                    heights[j]+=1;
                }
                else{
                    heights[j]=0;
                }
            }
             int area = largestRectangleArea(heights);
             maxArea = Math.max(area,maxArea);
        }
        
        return maxArea;
        
    }
    
    //Same as -> 84. Largest Rectangle in Histogram
     public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<int[]> stack = new Stack<>();  // stack to store pairs of (index, height)
        
        for (int i = 0; i < heights.length; i++) {
            int start = i;
            while (!stack.isEmpty() &&  heights[i] < stack.peek()[1]) {
                int[] top = stack.pop();
                int index = top[0];
                int height = top[1];
                maxArea = Math.max(maxArea, height * (i - index));
                start = index;
            }
            stack.push(new int[]{start, heights[i]});
        }

        for (int[] pair : stack) {
            int index = pair[0];
            int height = pair[1];
            maxArea = Math.max(maxArea, height * (heights.length - index));
        }

        return maxArea;
    }
}