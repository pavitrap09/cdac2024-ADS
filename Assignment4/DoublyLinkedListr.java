package Assignment4;

public class DoublyLinkedListr {

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

    // Method to reverse the doubly linked list
    public void reverse() {
        Node temp = null;
        Node current = head;

        // Swap next and prev pointers for all nodes of the doubly linked list
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev; // Move to the next node
        }

        // Update the head and tail pointers
        if (temp != null) {
            head = temp.prev;
        }
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
        DoublyLinkedListr list = new DoublyLinkedListr();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        System.out.println("Doubly Linked List before reversal:");
        list.display();

        // Reverse the doubly linked list
        list.reverse();

        System.out.println("Doubly Linked List after reversal:");
        list.display();
    }
}
