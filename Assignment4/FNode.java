package Assignment4;

public class FNode {
    Node root;

    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    FNode() {
        root = null;
    }

    FNode(int d) {
        root = new Node(d);
    }

    // Method to print the head node of every node in the binary tree
    void printHeadNodes(Node node, Node headNode) {
        if (node == null)
            return;

        // Handling the case for the root node separately
        if (headNode == null)
            System.out.println("Head node of " + node.data + ": " + node.data);
        else
            System.out.println("Head node of " + node.data + ": " + headNode.data);

        // Recursive calls for left and right subtrees
        printHeadNodes(node.left, node);
        printHeadNodes(node.right, node);
    }

    public static void main(String args[]) {
        FNode tree = new FNode();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        // Print the head node of every node in the binary tree
        tree.printHeadNodes(tree.root, null);
    }
}

