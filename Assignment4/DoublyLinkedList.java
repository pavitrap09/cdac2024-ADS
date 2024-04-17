package Assignment4;

public class DoublyLinkedList {

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

    public void display() {
        Node current = head;
        System.out.print("Forward: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.print("\nBackward: ");
        current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        System.out.println("Doubly Linked List in forward and backward direction:");
        list.display();
    }
}
