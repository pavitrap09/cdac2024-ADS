package Assignment4;
public class SortedDoublyLinkedList {

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

    // Method to insert a node in sorted order into the doubly linked list
    public void insertSorted(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        if (data <= head.data) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data < data) {
            current = current.next;
        }
        if (current.next == null) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
    }

    // Method to display the doubly linked list in forward direction
    public void displayForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to display the doubly linked list in backward direction
    public void displayBackward() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SortedDoublyLinkedList list = new SortedDoublyLinkedList();
        list.insertSorted(5);
        list.insertSorted(10);
        list.insertSorted(2);
        list.insertSorted(8);

        System.out.println("Doubly Linked List in forward direction:");
        list.displayForward();

        System.out.println("Doubly Linked List in backward direction:");
        list.displayBackward();
    }
}

