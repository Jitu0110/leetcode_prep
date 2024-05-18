//Heap add and remove is O(log(n))
//Heap find max and min is O(1)
class MedianFinder {

    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;
    
    public MedianFinder() {
        minHeap = new PriorityQueue<Integer>(); // For upper half
        maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder()); // For lower half
    }
    
    public void addNum(int num) {
       if(maxHeap.isEmpty()|| num < maxHeap.peek()){
           maxHeap.offer(num);
       }
       else{
           minHeap.offer(num);
       }
        
         // Balance the heaps
        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.offer(maxHeap.poll());
        }
        else if(minHeap.size() > maxHeap.size()){
            maxHeap.offer(minHeap.poll());
        }
        
    }
    
    public double findMedian() {
        if (maxHeap.size() > minHeap.size()) {
            return maxHeap.peek();
        } 
        else if(minHeap.size() > maxHeap.size()){
            return minHeap.peek();
        }
        else
            return (maxHeap.peek() + minHeap.peek())/ 2.0;
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */