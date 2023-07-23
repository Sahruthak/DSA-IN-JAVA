class TrieNode{
    public boolean isWord;
    public TrieNode[] children = new TrieNode[26];
}
class Trie {
    private TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode dummy = root;
        for(int i=0; i<word.length(); i++){
            char currentCharacter = word.charAt(i);
            if(dummy.children[currentCharacter - 'a'] == null)
                dummy.children[currentCharacter - 'a'] = new TrieNode();
            dummy = dummy.children[currentCharacter - 'a'];
        }
        dummy.isWord = true;
    }
    
    public boolean search(String word) {
        TrieNode dummy = root;
        for(int i=0; i<word.length(); i++){
            char currentCharacter = word.charAt(i);
            if(dummy.children[currentCharacter - 'a'] == null)
                return false;
            dummy = dummy.children[currentCharacter - 'a'];
        }
        return dummy.isWord;
    }
    
    public boolean startsWith(String word) {
        TrieNode dummy = root;
        for(int i=0; i<word.length(); i++){
            char currentCharacter = word.charAt(i);
            if(dummy.children[currentCharacter - 'a'] == null)
                return false;
            dummy = dummy.children[currentCharacter - 'a'];
        }
        return true;
    }
}
