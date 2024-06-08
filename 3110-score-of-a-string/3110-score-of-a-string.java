class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        for(int i = 0; i < s.length()-1; i++){
            int dif= s.charAt(i) - s.charAt(i+1);
            dif = dif < 0? -dif : dif;
            sum+=dif;
        }
        return sum;
    }
}