class Solution {
    
public boolean halvesAreAlike(String s) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        int vowelCount1 = 0;
        int vowelCount2 = 0;

        for(int i=0; i < s.length()/2;i++){
            s1.push(s.charAt(i));
        }
        for(int i=s.length()/2; i < s.length();i++){
            s2.push(s.charAt(i));
        }
        
        while(!s1.empty()){
            Character c1 = s1.pop();
            if(isVowel(c1)){
                vowelCount1++;
            }
            
            Character c2 = s2.pop();
            if(isVowel(c2)){
                vowelCount2++;
            }
        }
    System.out.println(vowelCount1);
    System.out.println(vowelCount2);
        
        if(vowelCount1 == vowelCount2){
            return true;
        }
        
        return false;
    }
    
    public boolean isVowel(Character c){
        String s = c.toString().toLowerCase();
        if(s.equals("a") || s.equals("e") || s.equals("i")|| s.equals("o") || s.equals("u")){
            return true;
        }
        return  false;
    }
}