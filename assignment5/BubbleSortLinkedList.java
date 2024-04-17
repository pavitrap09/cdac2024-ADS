package assignment5;

public class BubbleSortLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    private Node head;

   
    private void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    
    public void bubbleSort() {
        if (head == null || head.next == null)
            return;

        Node current = head;
        Node temp;
        boolean swapped;

        do {
            swapped = false;
            current = head;

            while (current.next != null) {
                if (current.data > current.next.data) {
                    // Swap nodes
                    temp = current.next;
                    current.next = temp.next;
                    temp.next = current;

                    if (current == head)
                        head = temp;
                    else {
                        // Find the previous node of current
                        Node prev = head;
                        while (prev.next != current)
                            prev = prev.next;
                        prev.next = temp;
                    }

                    swapped = true;
                } else
                    current = current.next;
            }
        } while (swapped);
    }

    
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleSortLinkedList list = new BubbleSortLinkedList();
        list.insert(64);
        list.insert(34);
        list.insert(25);
        list.insert(12);
        list.insert(22);
        list.insert(11);
        list.insert(90);

        System.out.println("Linked List before sorting:");
        list.printList();

        list.bubbleSort();

        System.out.println("Linked List after sorting:");
        list.printList();
    }
}

