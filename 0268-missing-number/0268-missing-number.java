class Solution {
    public int missingNumber(int[] nums) {
        
        /*
        Time - O(N)  Space - (N)
        //Exists must have length of 1 greater than nums
        int exists[] = new int[nums.length+1]; 
        
        for(int i=0;i<nums.length;i++){
            int x = nums[i];
            exists[x]++;
        }
        
        for(int j=0;j<exists.length;j++){
            if(exists[j]==0){
                return j;
            }
        }
        return 0;
        */
        
        
        // Optimal solution => Time - O(N)   Space - O(1) 
        
        //Sum of first n natural numbers = n * n+1 / 2
        int total = nums.length * (nums.length + 1)/2;
        int sum = 0;
        
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
        }
        return total - sum;
        
    }
}