class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        
        while(true){
            slow = nums[slow];
            fast = nums[nums[fast]];
                
            if(slow == fast)
             break;
        }
        
        int temp = 0;
        
        while(temp!=slow){
            temp = nums[temp];
            slow = nums[slow];
        }
        
        return slow;
        
    }
}