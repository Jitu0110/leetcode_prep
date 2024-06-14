class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {
        // Initialize the array to store the results
        int[] ans = new int[nums.length - k + 1];
        // Initialize an index for the result array
        int j = 0;
        // Initialize a deque to store indices of elements in the current window
        Deque<Integer> q = new LinkedList<>();
        
        // Traverse through the array
        for (int i = 0; i < nums.length; i++) {
            // Remove elements from the front of the deque if they are out of the current window range
            if (!q.isEmpty() && q.peekFirst() < i - k + 1) q.pollFirst();
            
            // Remove elements from the back of the deque while the current element is greater than the element at the back
            while (!q.isEmpty() && nums[i] > nums[q.peekLast()]) q.pollLast();
            
            // Add the current index to the deque
            q.offer(i);
            
            // When the window has reached size k, store the maximum element of the current window in the result array
            if (i >= k - 1) ans[j++] = nums[q.peekFirst()];
        }
        
        // Return the array of maximum values for each sliding window
        return ans;
    }
}

    
    
    
//----------BRUTE FORCE - O(K * (n-k)) time complexity - TLE
//     public int[] maxSlidingWindow(int[] nums, int k) {
        
        
//         Queue<Integer> queue = new LinkedList<>();
//         List<Integer> result = new ArrayList<>();
//         int max = Integer.MIN_VALUE;
        
//         for(int i = 0; i<k; i++){
//             queue.offer(nums[i]);
//         }
        
//         for (Integer num : queue) {
//             if (num > max) {
//                 max = num;
//             }
//         }
        
//         result.add(max);
        
        
//         for(int j = k; j < nums.length; j++){
//             max = Integer.MIN_VALUE;
//             queue.poll();
//             queue.offer(nums[j]);
            
//             for (Integer num : queue) {
//               if (num > max) {
//                  max = num;
//              }
//             }
            
//             result.add(max);
//         }
            
//         return result.stream().mapToInt(i->i).toArray();  
            
//         }
//}
    
