class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()){
            //Early Termination
            return false;
        }
        
        HashMap<Character,Integer> wordCountMap = new HashMap<Character,Integer>();
        
        //Add characters of String 's' into HashMap
        for(int i = 0; i < s.length(); i++){
            
            if( wordCountMap.get(s.charAt(i)) == null){
                wordCountMap.put(s.charAt(i),1);
            }
            else
            {
                int count = wordCountMap.get(s.charAt(i));
                wordCountMap.put(s.charAt(i),++count);
            }
        }
        
         //Remove characters of String 't' from HashMap
         for(int i = 0; i < t.length(); i++){
            
            if( wordCountMap.get(t.charAt(i))==null){
                //New Character found, return false
                
                return false;
            }
            else
            {
                int count = wordCountMap.get(t.charAt(i));
                wordCountMap.put(t.charAt(i),--count);
            }
        }
        
         // Check if all counts are zero
        for (int count : wordCountMap.values()) {
            if (count != 0) {
                return false;
            }
        }
        
        return true;
        }
    }
