class Solution {
    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        int[] left_products = new int[N];
        left_products[0]=1;
        int[] right_products = new int[N];
        right_products[N-1]=1;
        int[] output = new int[N];   
        
        for(int i=1;i<N;i++){
           left_products[i] = left_products[i-1] * nums[i-1];
        }
        for(int j=N-2;j>=0;j--){
            right_products[j] = right_products[j+1]*nums[j+1];
        }
        
        for(int k=0;k<N;k++){
           output[k] = right_products[k] * left_products[k];
        }
        return output;
    }      
}