class Solution {
    public int findKthLargest(int[] nums, int k) {
        int result = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)-> b - a);
        
        //O(N * log(N))
        for(int num : nums){
            pq.offer(num);
        }
        
        //O(k*log(N))
        for(int i=0; i<k; i++){
            result = pq.poll();
        }
        
        return result;
    }
}