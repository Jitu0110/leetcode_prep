class Solution {
    
    //1D - BFS solution using 2 pointers
    //Space - O(1)
    //Time - O(N)
    
    public int jump(int[] nums) {
        int result = 0;
        
        int left = 0;
        int right= 0;
        
        
        while(right < nums.length - 1  ){
            int farthest = 0;
            
            for(int i=left;i<=right;i++){
                farthest = Math.max(farthest,i + nums[i]);
            }
            
            left = right + 1;
            right = farthest;
            result++;
        }
        
        return result;
    }
}