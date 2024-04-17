package Assignment4;

public class BT3 {
    Node root;

    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    BT3() {
        root = null;
    }

    BT3(int d) {
        root = new Node(d);
    }

    Node findNode(Node node, int key) {
        if (node == null || node.data == key)
            return node;
        Node leftResult = findNode(node.left, key);
        if (leftResult != null)
            return leftResult;
        return findNode(node.right, key);
    }

   
    Node leftmostNode(Node node) {
        if (node == null)
            return null;
        while (node.left != null)
            node = node.left;
        return node;
    }

  
    Node inorderSuccessor(Node root, Node node) {
      
        if (node.right != null)
            return leftmostNode(node.right);

       
        Node successor = null;
        while (root != null) {
            if (node.data < root.data) {
                successor = root;
                root = root.left;
            } else if (node.data > root.data)
                root = root.right;
            else
                break;
        }
        return successor;
    }

    public static void main(String args[]) {
        BT3 tree = new BT3();
        tree.root = new Node(20);
        tree.root.left = new Node(15);
        tree.root.right = new Node(25);
        tree.root.left.left = new Node(10);
        tree.root.left.right = new Node(18);
        tree.root.right.left = new Node(22);
        tree.root.right.right = new Node(30);

        int key = 18;
        Node node = tree.findNode(tree.root, key);
        if (node == null)
            System.out.println("Node with key " + key + " not found.");
        else {
            Node successor = tree.inorderSuccessor(tree.root, node);
            if (successor != null)
                System.out.println("Inorder successor of " + key + " is " + successor.data);
            else
                System.out.println("Inorder successor of " + key + " does not exist.");
        }
    }
}
