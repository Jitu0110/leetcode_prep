class Solution {
    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^A-Za-z0-9]","");  
        if(s.isEmpty()){
            return true;
        }
        s = s.toLowerCase();
       
        int j = s.length()-1;
        for(int i =0; i<s.length()/2; i++ ){
            if(s.charAt(i) == s.charAt(j)){
                j--;
            }
            else{
                return false;
            }
        }
        
        return true;
        
    }
}