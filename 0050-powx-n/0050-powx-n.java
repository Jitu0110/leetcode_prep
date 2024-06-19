class Solution {
    public double myPow(double x, int n) {

        if(n==0){
            return 1;
        }
        
        if(x==0){
            return 0;
        }
        
        double res = helper(x, Math.abs(n));
        
        if(n<0){
            return 1/res;
        }
        
        return res;
    }
    
    private double helper( double x , int n){
        if(n==0){
            return 1;
        }
        
        double half = helper(x, n/2);
        
        double result = half * half;
        
        if(n%2 == 0){
            return result;
        }
        
        return result * x;
    }
    
    
}
