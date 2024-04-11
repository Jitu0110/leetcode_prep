class Solution {
    public int rob(int[] nums) {
        
     //Only 1 element exists   
     if(nums.length == 1){
         return nums[0];
     }
    
     //Only 2 elements exists
     if(nums.length == 2){
         return Math.max(nums[0],nums[1]);
     }
     
        
     int length = nums.length;
     int[] result1 = new int[length-1];
     int[] result2 = new int[length-1];
        
     result1[0] = nums[0];
     result1[1] = Math.max(nums[1],nums[0]);
     
     //Excluding the last element 
     for (int i=2; i < nums.length-1; i++){
         result1[i] = Math.max(nums[i] + result1[i-2], result1[i-1]);
     }  
        
     result2[0] = nums[1];
     result2[1] = Math.max(nums[1],nums[2]);
    
     //Excluding the first element 
     for (int i=3; i < nums.length; i++){
         int j = i-1;
         result2[j] = Math.max(nums[i] + result2[j-2], result2[j-1]);
     }
        
    
     return Math.max(result1[result1.length-1] , result2[result2.length-1]);
    
    }
}