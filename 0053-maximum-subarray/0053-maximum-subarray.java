class Solution {
    //Kadane's Algorithm - The key idea is to maintain a running sum (curSum) and reset it to 0 whenever it becomes negative
    //time - O(N)
    //space - O(1)
    public int maxSubArray(int[] nums) {

       int curSum = 0;
       int max = nums[0];
        
        for(int n : nums ){
           if(curSum < 0){
               curSum = 0;
           }
            curSum +=n;
            max = Math.max(max,curSum);
        }
        
        return max;
        
    }
}