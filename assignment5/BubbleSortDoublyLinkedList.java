package assignment5;

public class BubbleSortDoublyLinkedList {

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int d) {
            data = d;
            prev = null;
            next = null;
        }
    }

    private Node head;
    private Node tail;

    public BubbleSortDoublyLinkedList() {
        head = null;
        tail = null;
    }

    // Function to insert a node at the end of the doubly linked list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Function to perform bubble sort on doubly linked list
    public void bubbleSort() {
        if (head == null || head.next == null)
            return;

        boolean swapped;
        Node current;
        Node last = null;

        do {
            swapped = false;
            current = head;

            while (current.next != last) {
                if (current.data > current.next.data) {
                    swapNodes(current, current.next);
                    swapped = true;
                }
                current = current.next;
            }
            last = current;
        } while (swapped);
    }

    // Function to swap two nodes in the doubly linked list
    private void swapNodes(Node node1, Node node2) {
        int temp = node1.data;
        node1.data = node2.data;
        node2.data = temp;
    }

    // Function to display the doubly linked list in forward direction
    public void displayForward() {
        Node current = head;
        System.out.print("Forward: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Function to display the doubly linked list in backward direction
    public void displayBackward() {
        Node current = tail;
        System.out.print("Backward: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleSortDoublyLinkedList list = new BubbleSortDoublyLinkedList();
        list.insert(64);
        list.insert(34);
        list.insert(25);
        list.insert(12);
        list.insert(22);
        list.insert(11);
        list.insert(90);

        System.out.println("Linked List before sorting:");
        list.displayForward();
        list.displayBackward();

        list.bubbleSort();

        System.out.println("Linked List after sorting:");
        list.displayForward();
        list.displayBackward();
    }
}

