class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;  // Any number raised to the power of 0 is 1
        }
        
        // Handle the negative exponent by converting to positive and inverting the result
        double result = helper(x, Math.abs(n));
        
        // If n is negative, return 1/result, otherwise return result
        return n < 0 ? 1 / result : result;
    }
    
    private double helper(double x, int n) {
        if (n == 0) {
            return 1;  // Base case: any number to the power of 0 is 1
        }
        
        double half = helper(x, n / 2);  // Recursively calculate the half power
        
        // Square the result of half to get x^(n/2) * x^(n/2)
        if (n % 2 == 0) {
            return half * half;
        } else {
            // If n is odd, we need to multiply by x one more time
            return half * half * x;
        }
    }
}
