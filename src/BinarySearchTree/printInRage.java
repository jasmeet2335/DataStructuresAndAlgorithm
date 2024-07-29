package BinarySearchTree;

public class printInRage {
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
         * First thing is to build the tree
         * Then we need a way to print through it. - inorder
         * 
         * last we need a function to print between k1 and k2. 
         */

    public static Node buildTree(Node root, int val){
        if(root == null) {
            root = new Node(val); 
            return root;
        }
        if(root.data > val){
            //Left sub-tree
            root.left = buildTree(root.left, val);
        } else if(root.data < val){
            // Right sub-tree
            root.right = buildTree(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root){
        if(root == null) {
            return;
        }
        
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void printInRange(Node root, int k1, int k2) {
        if(root == null) {
            return;
        }

        if(root.data >= k1 && root.data <= k2) {
            // left side as well as the right side
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " "); 
            printInRange(root.right, k1, k2);
        } else if(root.data >= k2) {
            // right side
            printInRange(root.left, k1, k2);
        } else if(root.data < k1) {
            // left side
            printInRange(root.right, k1, k2);
        }
    }
    public static void main(String args[]) {
        int nodes[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        int k1 = 2, k2 = 12;
        for(int i = 0; i < nodes.length ; i++){
            root = buildTree(root, nodes[i]);
        }
        inorder(root);

        printInRange(root, k1, k2);
    }
}
