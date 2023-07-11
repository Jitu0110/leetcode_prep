class Solution {
    public int[] plusOne(int[] digits) {
        final int len = digits.length;
        int[] results = new int[len+1];
        
        Boolean done = false;
        int i= digits.length-1;
        
        while(!done){
            if(digits[i]+1 > 9){
                digits[i] = 0;
                results[i+1] = 0;    
                if(i>=1){
                i--;
                }
                else{
                    done = true;
                }
            }
            else{
                digits[i]+=1;
                break;
            }
        }
        
        if(done==true){
            results[0]=1;
            return results;
        }
        return digits;
        
    }
}