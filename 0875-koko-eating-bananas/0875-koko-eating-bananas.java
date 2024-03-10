class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();
        
        
        while (left < right) {
            int middle = (left + right) / 2;
            int hourSpent = 0;
            
            for (int pile : piles) {
                hourSpent += Math.ceil((double) pile / middle);
            }
            
            if (hourSpent <= h) {
                
                //The middle value could still be the solution
                right = middle;
            } else{
                //Since we have found the middle value to not be solution, we move left to middle + 1
                left = middle + 1;
            }
         }
        
        return left;
  }
}