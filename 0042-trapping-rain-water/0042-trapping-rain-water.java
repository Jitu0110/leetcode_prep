class Solution {
    public int trap(int[] height) {
        if (height.length == 0) 
            return 0;

        int l = 0, r = height.length - 1;
        int leftMax = height[l], rightMax = height[r];
        int res = 0;
        
        while(l < r){
        
            //By moving the shorter bar, there is a possibility of finding a bigger bar and trapping more water
            if(height[l]<=height[r]){
                l++;
                leftMax = Math.max(leftMax,height[l]);
                res+= leftMax - height[l];
            }
            else{
                r--;
                rightMax = Math.max(rightMax,height[r]);
                res+= rightMax - height[r];
            }
        }
        
        return res;
    }
}