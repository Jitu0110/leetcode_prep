class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        //Best solution -> Time - O(N)  Space - O(1)
        int N = nums.length;
        int[] output = new int[N];   
        output[0] = 1;
        
        //Calculate products starting from left side
        for(int i=1;i<N;i++){
           output[i] = output[i-1] * nums[i-1];
        }
        
        int R = 1;
        for(int j=N-1;j>=0;j--){
            output[j] = output[j]*R;
            R *= nums[j];
        }
        
        return output;
    }      
}

/*

    public int[] productExceptSelf(int[] nums) {
        
        //Time - O(N)  Space - O(N){2 arrrays - left and right}
        int N = nums.length;
        int[] left_products = new int[N];
        left_products[0]=1;
        int[] right_products = new int[N];
        right_products[N-1]=1;
        int[] output = new int[N];   
        
            //Calculate products starting from left side
        for(int i=1;i<N;i++){
           left_products[i] = left_products[i-1] * nums[i-1];
        }
        
            //Calculate products starting from right side
        for(int j=N-2;j>=0;j--){
            right_products[j] = right_products[j+1]*nums[j+1];
        }
        
        for(int k=0;k<N;k++){
           output[k] = right_products[k] * left_products[k];
        }
        return output;
    } 
    
    */