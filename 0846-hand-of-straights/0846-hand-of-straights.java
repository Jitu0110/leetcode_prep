class Solution {
    
    //Time - O(NlogN)
    //Space - O(N)
    public boolean isNStraightHand(int[] hand, int groupSize) {
        
        if(hand.length % groupSize!=0){
            return false;
        }
        
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int num : hand){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        //Sort in ascending order
        Arrays.sort(hand);
        
        for(int card : hand){
             if (map.get(card) == 0) continue;
            
            for(int i = 1; i< groupSize; i++){
                int currCount = map.getOrDefault(card+i,0);
                if(currCount>0){
                    map.put(card + i, currCount-1); 
                }
                else{
                    return false;
                }
            }
            
             map.put(card, map.get(card) - 1);
            
            
        }
        
        return true;
        
    }
}