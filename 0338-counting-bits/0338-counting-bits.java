class Solution {
    public int[] countBits(int n) {
        int result[] = new int[n+1];
        
        for(int i=0;i<=n;i++){
           result[i] = count(i);
        }
        return result;
    }
    
    
    private int count(int x){ 
        int count = 0;
        while(x!=0){
            x &= x-1;
            count++;
        }
        return count;
    }
}