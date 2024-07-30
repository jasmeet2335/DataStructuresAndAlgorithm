package BinaryTrees;
import java.util.*;

public class DeleteLeavesWithaGivenValue {
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
	public static void inorder(Node root) {
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
	
    public static Node deleteLeaves(Node root, int target){
        if(root == null) return null;
        
        root.left = deleteLeaves(root.left, target);
        root.right = deleteLeaves(root.right, target);
        if(root.left == null && root.right == null){
            // Leaf nofe
            if(root.data == target)  return null;
            else return root;
        }
        return root;
    }
	public static void main(String args[]) {
		
		int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1 , -1};
		BinaryTree tree = new BinaryTree();
		Node root = tree.buildTree(nodes);
        inorder(root);
	}
	
}
