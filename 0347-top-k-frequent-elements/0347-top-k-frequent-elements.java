class Solution {
    //time complexity : O(NLogN)
    //space complexity : O(M)
    public int[] topKFrequent(int[] nums, int k) {
        
       int[] result = new int[k];

       HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    
       for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        PriorityQueue<HashMap.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
            (a, b) -> b.getValue() - a.getValue() 
        );
        
        for(HashMap.Entry<Integer, Integer> entry : map.entrySet()){
            maxHeap.offer(entry);
        }
        
        for(int i =0; i<k; i++){
          HashMap.Entry<Integer, Integer> entry = maxHeap.poll();
          result[i] = entry.getKey();
        }
        
        return result;
    

    }
}