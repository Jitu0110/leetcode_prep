class Solution {
    public int climbStairs(int n) {
        
        if(n==1 || n==2){
            return n;
        }
        
        int a = 0;
        int b = 1;
        int c = 0;
        
        for(int i = 0; i < n; i++){
            c = b + a;
            a = b;
            b = c;
            
        }
        
        return c;
        
    }
}