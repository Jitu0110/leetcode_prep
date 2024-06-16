class Solution {
    public int[][] kClosest(int[][] points, int k) {

        int[][] result = new int[k][2];
        
        //X2 = 0 and Y2 = 0, so simplified equations
        PriorityQueue<int[]> minHeap = new PriorityQueue<int[]>((a,b) -> 
         (a[0]*a[0] + a[1]*a[1])  - (b[0]*b[0] + b[1]*b[1]));
        
        
        for(int[] point : points){
            minHeap.offer(point);
        }
        
        int i = 0;
        
        while(k > 0){
            result[i] = minHeap.poll();
            i++;
            k--;
        }
        
        return result;
        
        
    }
}