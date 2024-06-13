class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        
        Arrays.sort(seats);
        Arrays.sort(students);
        int steps = 0;
        for(int i=0; i < seats.length; i++){
            steps+=seats[i] - students[i] < 0? students[i]-seats[i] :seats[i] - students[i];
        }
        return steps;
    }
}