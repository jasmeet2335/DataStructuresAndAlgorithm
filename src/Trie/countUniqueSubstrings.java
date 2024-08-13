package Trie;

public class countUniqueSubstrings {
    /*
     * Given a string of length of n lowercase alphabet
     * characters, weneed to count total number of distinct
     * substring of this string 
     * 
     * str = " ababa";
     * ans = 10;
     * 
     * A substring = can be all prefix of all suffix = all suffic of all prefix
     * unique prefix = count of nodes of trie
     * 
     * 
     * Basic Approach
     * Find all suffix of string
     * Create Trie + insert
     * count nodes of trie
     *     - unique prefix
     *     - unique substrings 
     */

     static class Node {
        Node[] children = new Node[26];
        boolean eow = false; 

        for(int i =0; i<children.length; i++) {

        }
     }
    public static int countNodes() {
        return 0;
    }
    public static void main(String args[]){


    }
}
