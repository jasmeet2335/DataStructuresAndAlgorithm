package LinkedList;

public class DoublyLinkedList {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;


    // addFirst
    public void addFirst(int data){  
        Node newNode = new Node(data);
        size++; 
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //print
    public void print(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // remove First 
    public static int removeFirst(){
        if(head == null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            size--;
            head =tail =  null;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    // removeLast
    public static int removeLast(){
        if(head == null){
            return Integer.MIN_VALUE;
        }
        Node temp = tail;
        tail.prev.next = null;
        tail = tail.prev;

        return temp.data;
    }

    // Reverse a doubly linked list
    public void reverseDLL(){
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }

        head = prev;

    }


    public static void main(String args[]){
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();
        System.out.println(dll.size);

        //System.out.println("The data removed is: "+ dll.removeFirst());
        dll.print();
        dll.reverseDLL();
        dll.print();

    }
}
/*
 * Homework 
 * addLast
 * removeFirst
 */

 /*
  * Methods done
    addFirst
    addLast
    removeFirst
    removeLast
  */
