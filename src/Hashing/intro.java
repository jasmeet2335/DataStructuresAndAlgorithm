package Hashing;
import java.util.HashMap;
import java.util.Set;

public class intro {
    public static void main(String args[]) {
        /*
         * We use hashing to make maps and sets
         * Maps can have further types such as HashMap, Linked HashMap and TreeMap
         * Set can have further types such as HashSet, Linked Set and TreeSet
         */

        /*
         * Hash Map 
         * import.util.HashMap
         * HashMap<String, Integer> hm = new HashMap;
         * 
         * put(key,value)  O(1)
         * get(key) O(1)
         * contains(key) O(1)
         * remove(key) O(1)
         * 
         */
        //put key - O(1)
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        //Get key - O(1)
        System.out.println(hm.get("Canada"));

        //Contains key - O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Canada"));

        //remove key - O(1) 
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        //size 
        System.out.println(hm.size());

        //isEmpty()
        System.out.println(hm.isEmpty());

        // clear
        hm.clear();
        System.out.println(hm.isEmpty());

        /*
         * Iteration on hashmap
         * Set<Integer> keys = hm.keySet();
         */

         HashMap<String, Integer> hashmap2 = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("indonesia", 6);
        hm.put("Nepal", 5);

        // Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("Key= " + k+ ", value = "+hm.get(k));
        }
    }
}
