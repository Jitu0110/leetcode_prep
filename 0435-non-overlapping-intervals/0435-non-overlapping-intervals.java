
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        if(intervals.length == 0 || intervals.length == 1){
            return 0;
        }
        
        int result = 0;
        
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        
        for(int i = 0; i < intervals.length-1; i ++){
            
            //check for overlap
            if(intervals[i][1] > intervals[i+1][0])
            {
            if(intervals[i][1] < intervals[i+1][1]){
             intervals[i+1] = intervals[i];
            }

             result++;
            
            }
        }
        
        return result;
        
    }
}