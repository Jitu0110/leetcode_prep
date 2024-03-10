class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        if (strs.length == 0)
            return new ArrayList<>();
        
        for (String s : strs) {
            int[] hash = new int[26];
            for (char c : s.toCharArray()) {
                hash[c - 'a']++;
            }
            //convert frq array to string
            String key = Arrays.toString(hash);
            
            System.out.println("Key is: " + key);

            map.computeIfAbsent(key, k -> new ArrayList<>());
            map.get(key).add(s);
        }
      
        // Java 8 stream to convert the returned Collection<List<String> to List<List<String>>
        return map.values().stream().collect(Collectors.toList());
    }
}