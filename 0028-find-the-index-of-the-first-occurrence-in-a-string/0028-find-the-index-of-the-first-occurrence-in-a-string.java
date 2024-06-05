class Solution {
    public int strStr(String haystack, String needle) {
    
        int needleLength = needle.length();
        int haystackLength = haystack.length();
        
        if(needleLength > haystackLength){
            return -1;
        }
        int count = 0;
        
        for(int i = 0; i <= haystackLength - needleLength; i++){
             int k = i;
             count = 0;
            
            for(int j=0; j < needleLength; j++){
                if(haystack.charAt(k) == needle.charAt(j)){

                    count+=1;
                    k++;
                    if(count == needleLength){
                        return i;
                    }
                }
                else{
                    break;
                }
            }
        }
        
        return -1;
    }
}