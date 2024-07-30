package BinaryTrees;

public class univalued {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
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
    }
    public static boolean isUnivalued(Node root) {
        if(root == null) return true;

        if(root.left != null && root.data != root.left.data) return false;
        if(root.right != null && root.data != root.right.data) return false;
        boolean lfcall = isUnivalued(root.left);
        boolean rfcall = isUnivalued(root.right);

        return lfcall && rfcall;

    }
    public static void main(String args[]) {
        int nodes[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        BinaryTree tree  = new BinaryTree();

        Node root = tree.buildTree(nodes);
        isUnivalued(root);
    }
}
/// This is not working yet.

