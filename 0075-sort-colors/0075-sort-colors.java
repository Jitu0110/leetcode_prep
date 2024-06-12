class Solution {
    public void sortColors(int[] nums) {
        
        int x=0,y=0,z=0;
        
        for(int n : nums){
            if(n==0){
                x++;
            }
            if(n==1){
                y++;
            }
            if(n==2){
                z++;
            }
        }
        
        int k = 0;
        
        while(k<nums.length){
            if(x>0){
                nums[k] = 0;
                x--;
                k++;
                continue;
            }
            
            if(y>0){
                nums[k] = 1;
                y--;
                k++;
                continue;
            }
            
             if(z>0){
                nums[k] = 2;
                z--;
                k++;
                continue;
            }
        }
        
    }
}