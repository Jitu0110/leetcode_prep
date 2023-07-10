class Solution {
    public int missingNumber(int[] nums) {
        
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
    }
}