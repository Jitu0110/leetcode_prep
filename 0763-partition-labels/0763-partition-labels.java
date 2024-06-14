class Solution {
    public List<Integer> partitionLabels(String s) {
        
        HashMap<Character,Integer> lastSeenMap = new HashMap<>();
        List<Integer> result = new ArrayList<Integer>();
            
            
        //Space - O(26) which is actually O(1), since only lower case alphabets are stored
        for(int i=0; i< s.length(); i++){
            lastSeenMap.put(s.charAt(i),i);
        }
        
        int size = 0;
        int end = 0;
        
        //Time - O(N)
        for(int i=0;i< s.length(); i++){
            size+=1;
            end = Math.max(end,lastSeenMap.get(s.charAt(i)));
            
            if(i==end){
                //Reached end of partition
                result.add(size);
                size = 0; 
            }
        }
        
        return result;
    }
}