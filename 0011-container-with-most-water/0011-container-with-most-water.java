class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int res = 0;
        
        while(left < right){
            
            int area = (right - left) * Math.min(height[left],height[right]);
            
            res = Math.max(area,res);
            
            //Containers height is limited by height[left], so we move it to get a potentially bigger height to increase area
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        
        return res;
    }
}