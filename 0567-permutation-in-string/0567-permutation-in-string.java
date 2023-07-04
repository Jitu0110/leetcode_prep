class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] countS1 = new int[26];
        int[] countS2 = new int[26];

        // Initialize countS1 array
        for (char c : s1.toCharArray()) {
            countS1[c - 'a']++;
        }

        // Initialize countS2 array for the first window
        for (int i = 0; i < s1.length(); i++) {
            countS2[s2.charAt(i) - 'a']++;
        }

        // Traverse the sliding window
        for (int i = 0; i < s2.length() - s1.length(); i++) {
            // Compare countS1 and countS2 arrays
            if (Arrays.equals(countS1, countS2)) {
                return true;
            }

            // Update countS2 for the next window
            countS2[s2.charAt(i) - 'a']--;
            countS2[s2.charAt(i + s1.length()) - 'a']++;
        }

        // Check the last window
        if (Arrays.equals(countS1, countS2)) {
            return true;
        }

        return false;
    }
}