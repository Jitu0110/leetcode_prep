class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int sumGas = 0;
        int sumCost = 0;
        int startIndex = 0;
        int dif = 0;
        
        for(int i=0; i<gas.length; i++){
            sumGas+=gas[i];
            sumCost+=cost[i];
        }
        
        if(sumGas < sumCost){
            return -1;
        }
        
        for(int i = 0;i<gas.length; i++){
            dif += gas[i]-cost[i];
            
            if(dif<0){
                
                if(i == gas.length-1){
                    return -1;
                }
                
                dif = 0;
                startIndex = i+1;
            }  
        }
        
        
        return startIndex;
    }
}