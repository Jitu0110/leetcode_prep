// Time Complexity :  O(n)
// Space Complexity : O(1)
class Solution {
    public int characterReplacement(String s, int k) {

        int[] arr = new int[26];
        int largestCount = 0, beg = 0, maxlen = 0;
        
        for(int end = 0; end < s.length(); end ++){
            arr[s.charAt(end) - 'A']++;
            // Get the largest count of a single, unique character in the current window...
            largestCount = Math.max(largestCount, arr[s.charAt(end) - 'A']);
       
            //end - beg + 1 is the current window. - largestcount gives the number of characters to be replaced
            if(end - beg + 1 - largestCount > k){    
                arr[s.charAt(beg) - 'A']--;
                beg ++;
            }
           
            maxlen = Math.max(maxlen, end - beg + 1);   
            
        }
        return maxlen;     
    }
}