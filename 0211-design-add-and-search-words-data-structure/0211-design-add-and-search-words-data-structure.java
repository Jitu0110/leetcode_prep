class WordDictionary {
    
    class Node {
        private char value;
        private boolean isWord;
        private Node[] children;
        
        public Node(char val){
            this.value = val;
            this.isWord = false;
            this.children = new Node[26];
            
        }
    }

    Node root;
    
    public WordDictionary() {
        root = new Node('$');
    }
    
    public void addWord(String word) {
        
        Node curr = root;
        for(char x : word.toCharArray()){
            if(curr.children[x-'a'] == null){
                curr.children[x-'a'] = new Node(x);
            }
            
            curr = curr.children[x-'a'];
        }
        curr.isWord = true;
        
    }
    
    
    // TC O(m^2)
    public boolean search(String word) {
        return searchHelper(word, root, 0);
    }

    private boolean searchHelper(String word, Node curr, int index) {
        for (int i = index; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch == '.') {
                for (Node temp : curr.children) {
                    if (temp != null && searchHelper(word, temp, i + 1)) {
                        return true;
                    }
                }

                return false;
            }

            if (curr.children[ch - 'a'] == null) {
                return false;
            }

            curr = curr.children[ch - 'a'];
        }

        return curr.isWord;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */