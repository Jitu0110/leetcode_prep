class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            
            if(map.get(nums[i])== null){
                map.put(nums[i],i);
            }
            else{
                int j = map.get(nums[i]);
                
                int diff = i-j;
                if(diff<0){
                    diff*=-1;
                }
                
                if(diff<=k){
                    return true;
                }
                else{
                   map.put(nums[i],i);
                }
            }
        }
        
        return false;
    }
}