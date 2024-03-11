class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<Character>();
        
        for(int i=0; i< s.length() ; i++){
            
            Character c = s.charAt(i);
            
            if( c.equals('{') || c.equals('(') || c.equals('[')){
                stack.push(c);
            }
            
            if( c.equals('}') || c.equals(')') || c.equals(']')){
                if(stack.isEmpty()){
                    return false;
                }
                
                
                Character element = stack.pop();
                if( (c.equals('}') && element.equals('{')) || (c.equals(')') && element.equals('(')) || (c.equals(']') && element.equals('[')) ) {
                  //Do nothing
                } 
                else{
                      return false;
                }
            }
        }
        if(!stack.empty())
            return false;
        else
            return true;
        
    }
}