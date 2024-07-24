package BinaryTrees;
import java.util.*;

public class countOfNodes {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            
            return newNode;
        }
        static int cnt = 0;
        public static int count(Node root){
            if(root == null) {
                return -1;
            }
            
            return 0;
        }
    }
    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1 , -1};
		BinaryTree tree = new BinaryTree();
		Node root = tree.buildTree(nodes);
    }
}
