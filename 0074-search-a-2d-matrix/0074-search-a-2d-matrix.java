class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      
        int i=0;
        int j= matrix[0].length-1;
        
    while(i>=0 && i< matrix.length && j>=0) {
        
     if(target > matrix[i][j])
         i++;      
     else if(target < matrix[i][j]){
         j--;
     }
        else if(target==matrix[i][j]){
            return true;
        }
      }
        return false;
    }
}