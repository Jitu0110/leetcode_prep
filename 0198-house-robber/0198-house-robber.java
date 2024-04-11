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
     int[] result = new int[length];
        
     result[0] = nums[0];
     result[1] = Math.max(nums[1],nums[0]);
     
     for (int i=2; i < nums.length; i++){
         result[i] = Math.max(nums[i] + result[i-2], result[i-1]);
         System.out.println(result[i]);
     }   
        
    
     return result[length-1];
    
    }
}