package Assignment4;

public class DoublyLinkedListln {

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    private Node head;
    private Node tail;

    // Method to insert a node at the end of the doubly linked list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
    }

    // Method to find the largest node in the doubly linked list
    public int findLargest() {
        if (head == null) {
            System.out.println("Doubly linked list is empty.");
            return Integer.MIN_VALUE;
        }
        int max = head.data;
        Node current = head.next;
        while (current != null) {
            if (current.data > max) {
                max = current.data;
            }
            current = current.next;
        }
        return max;
    }

    // Method to display the doubly linked list in forward and backward directions
    public void display() {
        Node currentForward = head;
        Node currentBackward = tail;
        System.out.print("Forward: ");
        while (currentForward != null) {
            System.out.print(currentForward.data + " ");
            currentForward = currentForward.next;
        }
        System.out.print("\nBackward: ");
        while (currentBackward != null) {
            System.out.print(currentBackward.data + " ");
            currentBackward = currentBackward.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedListln list = new DoublyLinkedListln();
        list.insert(10);
        list.insert(5);
        list.insert(20);
        list.insert(15);
        list.insert(25);

        System.out.println("Doubly Linked List:");
        list.display();

        int largest = list.findLargest();
        System.out.println("Largest node in the Doubly Linked List: " + largest);
    }
}
