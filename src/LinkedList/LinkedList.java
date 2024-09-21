package LinkedList;
public class LinkedList {

    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail; 
    public static int size;

    //methods
    // add element to the first place. 
    public void addFirst(int data){
        Node newNode = new Node(data);
        size ++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode; 
    }

    // Adding element to the last place. 
    public void addLast(int data){ // O(1)
        Node newNode = new Node(data); 
        size++;
        if(head == null){
            tail = head = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // To print the linked list. 
    public void print() {  // O(n)
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // To add an element in the middle of the linked list
    public void add(int idx, int data){ //O(n)
        if(idx == 0){
            addFirst(data);
            return;
        }

        Node temp = head;
        Node newNode = new Node(data);
        size++;
        for(int i = 0; i <idx-1; i ++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }



    public static void main(String args[]){ 
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2, 9);
        ll.print();
        System.out.println("The size of LL is : " + ll.size);
    }

    /*
     * Methods added 
     * Add element in the front
     * Add element to the last 
     * Print the LL
     * Add element in the middle of LL
     * Size of LL
     * Remove first in LL
     * Remove last in LL
     * Iterative search 
     * Recursive search
     * Reverse a LL
     * Find and remove nth node from end
     * check if LL is Palindrome 
     */
}
