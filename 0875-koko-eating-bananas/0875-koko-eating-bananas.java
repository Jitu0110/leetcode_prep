class Solution {
    public int minEatingSpeed(int[] piles, int h) {
            int left = 1;
            int right = Arrays.stream(piles).max().getAsInt();

            while(left < right) {
                int hourCount = 0;

                int mid = (left + right) / 2;


                for(int i = 0; i< piles.length; i++){

                    if(piles[i] <= mid){
                        hourCount ++;
                    }

                    else {

                        hourCount += piles[i]/mid;

                        if(piles[i] % mid != 0){
                            hourCount++;
                        }
                    }

                }

              if(hourCount <= h){
                    right = mid ;
                }
               else{
                    left = mid + 1;
                }
    
            }

            return left;    
  }
}