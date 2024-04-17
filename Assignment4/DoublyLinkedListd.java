package Assignment4;

public class DoublyLinkedListd {

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

    // Method to delete a node from the doubly linked list
    public void delete(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                if (current == head) {
                    head = current.next;
                }
                if (current == tail) {
                    tail = current.prev;
                }
                if (current.prev != null) {
                    current.prev.next = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                return;
            }
            current = current.next;
        }
        System.out.println("Node with key " + key + " not found");
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
        DoublyLinkedListd list = new DoublyLinkedListd();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        System.out.println("Doubly Linked List before deletion:");
        list.display();

        list.delete(3); // Delete node with data 3

        System.out.println("Doubly Linked List after deletion:");
        list.display();
    }
}

