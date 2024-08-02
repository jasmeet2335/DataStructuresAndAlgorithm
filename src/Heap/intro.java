package Heap;
import java.util.Comparator;
import java.util.PriorityQueue;
public class intro {
    /*
     * We implement Priority Queue in JCF
     * We have functions such as
     * add () O(log n)
     * remove() O(log n)
     * peek() O(1)
     */


     static class Student implements Comparable<Student> {
        String name;
        int rank;
        
        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override 
        public int compareTo(Student s2){
            return this.rank -s2.rank;
        }
     }
     public static void main(String args[]) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder()); 
        pq.add(new Student("A", 4));
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2)); 
        pq.add(new Student("C", 12)); 

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + " -> " + pq.peek().rank);
            pq.remove();
        }
     }
}
/*
 * In heap data structure we implement the binary tree with the help array and
 * we use the the same to get priority queues
 * 
 * There are two types of heaps: max heap and min heap 
 * Max heap - Here the maximum will have more priority 
 * Min heap - Here the minimum will have the highest priority. 
 * 
 * We visualize the heaps as a tree and implement them as an array or arrayList.
 * 
 * Binary Tree - at most have 2 children 
 * 
 * Complete Binary Tree -
 * CBT is a Binary Tree which all the levels are completely 
 * filled except possibly the ladt one. which is filled from the left to the right.
 * 
 * Heap Order property
 * Children >= Parent (minHeap)
 * Children <= Parent (maxHeap)
 * 
 * In array list idx = i; This is a fixed property for heaps
 *  leftChild = 2i + 1;
 *  rightChild = 21 +2;
 * 
 */