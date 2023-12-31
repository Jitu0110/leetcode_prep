class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        Arrays.sort(people);
        int left = 0, right = people.length - 1;
        int boats = 0;
        
        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
                right--;
            } else {
                right--;
            }
            boats++;
        }
        
        return boats;
        
        
        /*This solution has a time complexity of O(n log n) due to the sorting step, where n is the number of people. The greedy approach helps in minimizing the number of boats required to carry all the people. */ 

    }
}