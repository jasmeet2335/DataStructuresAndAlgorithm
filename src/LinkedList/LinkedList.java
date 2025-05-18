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

      // Remove first in Linked list code 
      public int removeFirst() {
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }

        int value = head.data;
        head = head.next;
        size --;
        return value;
      }

      // Remove last in a linked list 
      public int removeLast(){
        if(size == 0) {
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        } else if(size ==1) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }
        
        Node prev = head;
        for(int i = 0; i <size-2; i ++){
            prev = prev.next;
        }

        int value = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return value;

      }

      // Detecting cycle in a Linked List - Floyd's Cycle Finding Algorithm 
      public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;                
            }
        }
        return false;
      }

      // Remove a loop/Cycle in a Linked List
      /*
        Find the last node
        LastNode.next = null

        The approach will be: to detect the cycle -> slow = head -> slow +1, fast +1
        This code will not work if we have a corner case where we have a full cycle
       */ 
      public static void removeCycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }

        if(cycle == false) {
            return;
        }

        //find meeting point 
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //remove cycle-> last.next = null
        prev.next = null;
      }

      //merge sort on a linked list o(n logn)
      /*
       * Find the middle of the linked list
       *    
       * Divide into left half and right half by mid.next = null
       * merge the two parts 
       */

       private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
       }

       private Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
       }


      public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        // find mid
        Node mid = getMid(head);

        // left and right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft, newRight);
      }


      // Zig Zag Linked List
      /*
       * For a linked list of the form 1 -> 2 -> 3-> 4 -> ...... n-1 -> n
       * convert it into a zig zag form that is 1 -> n -> 2 -> n-2 -> 3 ....
       * 
       * find midNode ( mid = 1st half last node)
       * 
       */
 
      public void zigzag() {
        //find midlle
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
         Node mid = slow;

        // reverse second half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr != null ){
            next = curr.next;
            curr.next  = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        // alternate merge
        while(left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        } 
      }


      // Doubly Linked List
      
    public static void main(String args[]){ 
        LinkedList ll = new LinkedList();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(2);
        // ll.addLast(1);
        // ll.add(2, 9);
        // ll.print();
        // System.out.println("The size of LL is : " + ll.size);
        // System.out.println(ll.recSearch(3));
        // System.out.println(ll.recSearch(10));
        // ll.reverse();
        // ll.deleteNthFromEnd(3);
        // ll.print();
        // System.out.println(ll.checkPalindrome());

        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;       
        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());
        
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);
        ll.head = ll.mergeSort(ll.head);  
        ll.print();  
        ll.zigzag();
        ll.print();  






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

     /*
      * LL Part 2
      Detecting Cycle in LL
      Removing Cycle in LL
      Merge Sort On lL
      Zig Zag LL
      Doubly LL
      Reverse a Doubly LL
      Circular LL
      */
}
