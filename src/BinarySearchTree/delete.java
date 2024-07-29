package BinarySearchTree;

public class delete {
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

     public static Node delete(Node root, int val) {
        if(root.data <val) {
            root.right = delete(root.right, val);
        } else  if(root.data > val) {
            root.left = delete(root.left ,val);
        } else {
            //Case 1 Leaf Node
            if(root.left == null && root.right == null) {
                return null;
            }

            // Case 2 One child
            if(root.left == null) {
                return root.right;
            } else if(root.right == null) {
                return root.left;
            }

            //Case 3 - both children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            delete(root.right, IS.data); 
        }
        return root;
     }

     public static Node findInorderSuccessor(Node root) {
        while(root.left != null ){
            root = root.left;
        }
        return root;
     }
    public static void main(String args[]) {
        /*
         * To delete a node we can consider the followsing cases with us:
         * Case 1: No child (Leaf node)
         *  In case 1 we will delete the node and return null to the parent.
         * Case 2: One child
         *  Delete the node and replace the node with the child node. 
         * Case 3: Two Children
         * Replace value with inorder successor and delete the node for the inorder successor
         * In order success in BSt will be the leftmost node in the right sub tree. The inorder success always has 0 or 1 child. 
         */

         int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        
        for(int i = 0; i <values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

        root = delete(root, 3);
        inorder(root);

        // The output for the both children is not corrected
    }
    
}
