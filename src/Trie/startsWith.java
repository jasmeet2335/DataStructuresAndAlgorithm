package Trie;

public class startsWith {
    public static class Node {
        Node[] children = new Node[26];
        boolean eow = false;

        public Node(){
            for( int i = 0; i <children.length; i++){
                children[i]  = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for(int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx]  == null) {
                curr.children[idx] = new Node();
            } 
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key) {
        Node curr = root;
        for(int level = 0; level < key.length(); level++) {
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx]  == null) {
                return false;
            } 
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }

    public static boolean startsWith(String prefix){ // o(N)
        Node curr = root;
        for(int i = 0; i <prefix.length(); i ++) {
            int idx = prefix.charAt(i) - 'a';
            if(curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    /*
     * Create a function boolean startsWith(String prefix)
     * for a trie. Return true if there is a previously inserted 
     * string word that has the prefix otherwise. 
     * 
     * Word[] = { apple, app, mange, man, woman}
     * prefix= app            output = true
     * prefix = moon          output = false
     */

     public static void main(String args[]) {
        String words[] = {"apple", "app", "mango", "man", "woman"};
         String prefix1 = "app";
         String prefix2 = "moon";

         for(int i = 0 ; i <words.length ; i ++) {
            insert(words[i]);
         }

         System.out.println(startsWith(prefix1));
         System.out.println(startsWith(prefix2));
     }
}
