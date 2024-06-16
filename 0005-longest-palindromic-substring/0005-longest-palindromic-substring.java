class Solution {
    public String longestPalindrome(String s) {
        String result = "";
        int resLength = 0;
        
        for(int i = 0; i < s.length(); i++){
            
            //ODD case
            int left = i;
            int right = i;
            
            while(left>=0 && right<=s.length()-1 && s.charAt(left) == s.charAt(right)){
                if(right-left+1>resLength){
                     resLength =right - left + 1;
                     result = s.substring(left,right+1);
                }
                left--;
                right++;
            }
            
            //Even case
            left = i;
            right = i+1;
            
            while(left>=0 && right<=s.length()-1 && s.charAt(left) == s.charAt(right)){
                if(right-left+1>resLength){
                     resLength =right - left + 1;
                     result = s.substring(left,right+1);
                }
                left--;
                right++;
            }
        }
        
        return result;
    }
}