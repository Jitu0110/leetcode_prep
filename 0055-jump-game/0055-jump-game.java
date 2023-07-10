class Solution {
    public boolean canJump(int[] nums) {
        
        // Time - O(N) , Space - O(1)
        int lastGoodIndex = nums.length-1;
        
        for(int i = nums.length-1; i>=0; i--){
            if(i + nums[i] >= lastGoodIndex ){
                lastGoodIndex =  i;
            }
        }
        
        return lastGoodIndex == 0;
    }
}