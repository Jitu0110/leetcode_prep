class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        HashMap<Integer, Integer> frequencies = new HashMap<>();
        for(int num : nums){
            if(frequencies.get(num)!=null){
                int val = frequencies.get(num);
                frequencies.put(num,++val);
            }
            else{
                frequencies.put(num,1);
            }
        }  
        
       // Determine the maximum frequency
        int maxFrequency = 0;
        for (int frequency : frequencies.values()) {
            maxFrequency = Math.max(maxFrequency, frequency);
        }
        
      // Calculate the total frequencies of elements with the maximum frequency
        int frequencyOfMaxFrequency = 0;
        for (int frequency : frequencies.values()) {
            if (frequency == maxFrequency) {
                frequencyOfMaxFrequency++;
            }
        }

        return maxFrequency * frequencyOfMaxFrequency;
    }
}