class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        List<Integer> arrayList = new ArrayList<Integer>();
        
        for(int i =0; i < nums.length;i++){
            
            if(map.get(target - nums[i])!= null){
                int indexFromMap = map.get(target - nums[i]);
                arrayList.add(indexFromMap);
                arrayList.add(i);
                break;
            }
            else{
                map.put(nums[i],i);
            }
                
        }

       
        int[] result = arrayList.stream().mapToInt(i->i).toArray();
        return result;
      
    }
}