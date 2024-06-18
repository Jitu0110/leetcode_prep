
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        
        Map<Integer,Integer> carMap = new HashMap<>();
        Stack<Double> stack = new Stack<>();
        Double timeToReachTarget = 0.0;
        
        
        for(int i = 0; i < position.length; i++){
            carMap.put(position[i],speed[i]);
        }
        
        //Sort in descending order
        Arrays.sort(position);
        
        
        for(int i = position.length-1; i>=0; i--){
            timeToReachTarget = (double)(target - position[i]) /carMap.get(position[i]);
                
            if(stack.isEmpty()){
                stack.push(timeToReachTarget);
            }
            
            //Push to stack only when the current value is greater than stack.peek()
            else if(!stack.isEmpty() && stack.peek() < timeToReachTarget){
                stack.push(timeToReachTarget);
            }
   
        }
        
        return stack.size();
        
        
    }
}