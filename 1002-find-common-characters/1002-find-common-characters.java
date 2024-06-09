class Solution {
    public List<String> commonChars(String[] words) {
         // Initialize the common count map with the first word
        Map<Character, Integer> commonCount = new HashMap<>();
        for (char c : words[0].toCharArray()) {
            commonCount.put(c, commonCount.getOrDefault(c, 0) + 1);
        }

        // Iterate over the rest of the words
        for (int i = 1; i < words.length; i++) {
            // Create a count map for the current word
            Map<Character, Integer> wordCount = new HashMap<>();
            for (char c : words[i].toCharArray()) {
                wordCount.put(c, wordCount.getOrDefault(c, 0) + 1);
            }
            
            // Update the common count to keep only minimum frequency
            for (char c : commonCount.keySet()) {
                if (wordCount.containsKey(c)) {
                    commonCount.put(c, Math.min(commonCount.get(c), wordCount.get(c)));
                } else {
                    commonCount.put(c, 0);
                }
            }

            // Remove characters with a count of 0
            commonCount.entrySet().removeIf(entry -> entry.getValue() == 0);
        }

        // Build the result list based on the common count map
        List<String> result = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : commonCount.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                result.add(String.valueOf(entry.getKey()));
            }
        }
        return result;
    }
}