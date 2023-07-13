class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        ArrayList<Integer> res = new ArrayList<Integer>();
        
        if(matrix.length==0){
            return res;
        }
        
        int rowBegin = 0;
        int rowEnd = matrix.length-1;
        int columnBegin=0;
        int columnEnd = matrix[0].length-1;
        
        while(rowBegin <= rowEnd && columnBegin <= columnEnd){
            
            //Right
            for(int i=columnBegin; i<=columnEnd; i++){
                res.add(matrix[rowBegin][i]);
            }
            rowBegin++;
            
            //Down
            for(int i=rowBegin; i<=rowEnd;i++){
                res.add(matrix[i][columnEnd]);
            }
            columnEnd--;
            
            //Left
            if(rowBegin <= rowEnd) {
              for(int i= columnEnd; i>=columnBegin; i--){
                 res.add(matrix[rowEnd][i]);
              }
            }
            rowEnd--;
            
            //Up
             if(columnBegin <= columnEnd) {
               for(int i = rowEnd; i>= rowBegin; i--){
                 res.add(matrix[i][columnBegin]);
               }
             }
            columnBegin++;
        }
        
        return res;
    }
}