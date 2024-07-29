package BinarySearchTree;

public class buildaBST {
    
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    /*
     * If the root == null then
     * make a new root add the value 5 to it,
     * 
     * If root. data > value then 
     * root .left = buildTree(value)
     * else root.data < value then
     * root.right value;
     * 
     * Return root
     */

    public static Node insert(Node root, int values) {
        if(root == null) {
            root = new Node(values);
            return root;
        }
        if(root.data > values){
            root.left = insert(root.left, values);
        } else {
            root.right = insert(root.right, values);
        }

        return root;
    }

     public static void inorder(Node root) {
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
     }
      public static void main(String args[]) {
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;
        
        for(int i = 0; i <values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();
    }
}
