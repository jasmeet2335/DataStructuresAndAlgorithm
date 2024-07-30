package BinaryTrees;

public class invertBinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public void dfs(Node root) {
        if(root == null) return;

        dfs(root.left);
        dfs(root.right);

        // swap [root.left, root.right]
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    public Node invertTree(Node root) {
        dfs(root);
        return root;
    }
    public static void main(String args[]) {

    }
}
