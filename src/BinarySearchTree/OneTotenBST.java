package BinarySearchTree;

public class OneTotenBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public static Node buildTree(Node root, int values){
            if(root == null) {
                root = new Node(values);
                return root;
            }

            if(root.data > values){
                //left sub tree
                root.left = buildTree(root.left, values);
                
            } else {
                // right sub tree
                root.right = buildTree(root.right, values);
            }
            return root;
        }

        public static void inorder(Node root){
            if(root == null) {
                return;
            }
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
        public static void main(String args[]) {
            int nodes[] = {5, 2, 3, 4, 1, 6, 7, 8, 10, 9};
            Node root = null;
            for(int i = 0; i< nodes.length; i++){
                root = buildTree(root, nodes[i]);
            }
            inorder(root);

        }
        
    }
}
