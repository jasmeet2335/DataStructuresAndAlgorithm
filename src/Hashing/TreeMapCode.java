package Hashing;
import java.util.*;
public class TreeMapCode {
    /*
     * In this hash map implementation the keys are sorted.
     * put, get and remove are 0(log n)
     * 
     * TreeMap<K, V> hm = new TreeMap<>();
     * These are implemented using Red Black Trees which are a BST thing- also called self balancing Trees
     */

     public static void main(String args[]){
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("US", 50);
        tm.put("Nepal", 5);

        System.out.println(tm);// The output will be sorted on the basis of Strings. here the Strings will be sorted alphabetically.
     }
}
