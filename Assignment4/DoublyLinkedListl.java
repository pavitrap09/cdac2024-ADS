package Assignment4;

public class DoublyLinkedListl {

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

    // Method to find the length of the doubly linked list
    public int length() {
        int length = 0;
        Node current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    // Method to display the doubly linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedListl list = new DoublyLinkedListl();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        System.out.println("Doubly Linked List:");
        list.display();

        int length = list.length();
        System.out.println("Length of the Doubly Linked List: " + length);
    }
}

