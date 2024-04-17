package Assignment4;

public class BT2 {
	
	    Node root;

	    static class Node {
	        int data;
	        Node left, right;

	        Node(int d) {
	            data = d;
	            left = right = null;
	        }
	    }

	    BT2() {
	        root = null;
	    }

	    BT2(int d) {
	        root = new Node(d);
	    }

	    // Inorder traversal
	    void printInorder(Node n) {
	        if (n == null)
	            return;

	        printInorder(n.left);
	        System.out.print(n.data + " ");
	        printInorder(n.right);
	    }

	    void inorder() {
	        printInorder(root);
	    }

	    // Search method
	    boolean search(Node node, int key) {
	        // Base case: If the tree is empty or the node is not found
	        if (node == null)
	            return false;

	        // If the key is found at the current node
	        if (node.data == key)
	            return true;

	        // Recursively search in the left and right subtrees
	        boolean leftSearch = search(node.left, key);
	        boolean rightSearch = search(node.right, key);

	        // Return true if found in either subtree, otherwise false
	        return leftSearch || rightSearch;
	    }

	    public static void main(String args[]) {
	        BT2 tree = new BT2();
	        tree.root = new Node(20);
	        tree.root.left = new Node(25);
	        tree.root.right = new Node(56);
	        tree.root.right.right = new Node(12);

	        System.out.println("Inorder---->");
	        tree.inorder();

	        int key = 12;
	        if (tree.search(tree.root, key))
	            System.out.println("\n" + key + " is found in the Binary Tree.");
	        else
	            System.out.println("\n" + key + " is not found in the Binary Tree.");
	    }
	}

