class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int result = 0;
        int prev = 1;
        
        
        for(int i=s.length()-1; i >= 0; i--){
            
            int curr = map.get(s.charAt(i));
            if(curr < prev){
                result-=curr;
            }
            else{
               result += curr;
            }
            
            prev = curr;
            
        }
        
        return result;
    }
}