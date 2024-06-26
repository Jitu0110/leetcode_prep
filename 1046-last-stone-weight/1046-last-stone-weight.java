class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        
        
        //Time - O(nlogn)
        for(int x : stones){
            pq.offer(x);
        }
        
        while(pq.size()>1){
            int x = pq.poll();
            int y = pq.poll();
            
            int resultAfterCollision = x-y;
            if(resultAfterCollision!=0){
                pq.offer(resultAfterCollision);
            }
        }
        
        
        return pq.isEmpty() ? 0 : pq.poll();
    }
}