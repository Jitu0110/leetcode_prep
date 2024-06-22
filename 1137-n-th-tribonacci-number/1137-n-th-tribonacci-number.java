class Solution {
    public int tribonacci(int n) {
        if(n==1 || n==2){
            return 1;
        }
        
        if(n==0){
            return 0;
        }
        
        int t0 = 0;
        int t1 = 1;
        int t2 = 1;
        
        for(int i=0 ; i < n-2; i++){
            int sum = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = sum;
        }
        
        return t2;
    }
}