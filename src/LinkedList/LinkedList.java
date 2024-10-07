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
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
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


    public int Iterativesearch(int key) { // o(n)
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public int recSearchHelper(Node head, int key){ // 0(n)
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }
        int idx = recSearchHelper(head.next, key);
        if(idx == -1){
             return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return recSearchHelper(head, key);
    }

    //Reverse a linked list - iterative approach
    /*
     * Reversing a linked list is done in 4 steps:
     *  next = curr.next
     *  curr.next = prev
     *  prev = curr
     *  curr = next 
     */
    public void reverse() { // 0(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //FInd and remove nth Node from the end - using a iterative approach 
    public void deleteNthFromEnd(int n){
        //calculate 
        int size = 0;
        Node temp = head;
        while(temp != null){
             temp = temp.next;
             size++;
        }

        if(n == size) {
            head = head.next; // remove first operation
            return;
        }

        int i = 1;
        int idxToFind = size - n;
        Node prev = head;
        while( i < idxToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    // Check if a linked list is a palindrome or not
    /*
     * This question will teach us - slow fast concept, reversing a linked half 
     * The same question can be solved using a arrayList or array or a string - By converting the linked list into the mentions data structures and then chceking if they are a palindrom or not
     * But we will not be using the above mentioned apprach as that would mean  Time complexity - 0(n) and Space Complexitu o(n)
     */

     /*
      * Time Complexity O(n)
        Space Complexity O(1)

        We can check if the linked list is a palindrom or not in teh following steps:
        find the midNode
        Reverse the 2nd half
        Check if the first half = second half
      */
      public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }

        return slow; // slow is my mid node
      }

      public boolean checkPalindrome(){
        if(head == null || head.next== null){
            return true;
        }
        //Step 1 - to find mid        
        Node midNode = findMid(head);

        // Step 2 - reverse 2nd half
        Node prev = null; 
        Node curr = midNode;
        Node next;

        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // right half head
        Node left = head;
        //Step 3- Check left and right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

      }


    public static void main(String args[]){ 
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(1);
        ll.add(2, 9);
        ll.print();
        System.out.println("The size of LL is : " + ll.size);
        System.out.println(ll.recSearch(3));
        System.out.println(ll.recSearch(10));
        ll.reverse();
        ll.deleteNthFromEnd(3);
        ll.print();
        System.out.println(ll.checkPalindrome());

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
