class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         // Three pointer technique
         //  Time: O(m+n) | Space: O(1)
       int r1 = m-1;
       int r2 = n-1;
       int w = m+n-1;
        
       while(w>=0){
           
           if(r1 >= 0 && r2 >= 0){
               if(nums1[r1] > nums2[r2]){
                   nums1[w] = nums1[r1];
                   r1--;
               }
               else{
                   nums1[w] = nums2[r2];
                   r2--;
               }
               
           }
           else if(r1 >= 0){
               nums1[w] = nums1[r1];
               r1--;
           }
           else{
               nums1[w] = nums2[r2];
               r2--;
           }
           w--;
       }
        
    }
}