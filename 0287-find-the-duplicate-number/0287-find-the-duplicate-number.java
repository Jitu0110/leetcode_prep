class Solution {
    public int findDuplicate(int[] nums) {
        
        //Mix of Linked list and Floyd's Algorithm - Checkout Neetcode video for explanation
        int slow = 0;
        int fast = 0;
        
        while(true){
            slow = nums[slow];
            fast = nums[nums[fast]];
                
            if(slow == fast)
             break;
        }
        
        fast = 0;
        
        //Move them one step at a time
        while(fast!=slow){
            fast = nums[fast];
            slow = nums[slow];
        }
        
        return slow;
        
    }
}