package Assignment6;

import java.util.NoSuchElementException;

public class Deque<T> {

    private static class Node<T> {
        private T data;
        private Node<T> prev;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node<T> front;
    private Node<T> rear;
    private int size;

    public Deque() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
        size++;
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
        size++;
    }

    public T removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        T data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        } else {
            front.prev = null;
        }
        size--;
        return data;
    }

    public T removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        T data = rear.data;
        rear = rear.prev;
        if (rear == null) {
            front = null;
        } else {
            rear.next = null;
        }
        size--;
        return data;
    }

    public T peekFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return front.data;
    }

    public T peekLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return rear.data;
    }

    public void printDeque() {
        Node<T> current = front;
        System.out.print("Deque: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Deque<Integer> deque = new Deque<>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(3);
        deque.addLast(4);

        deque.printDeque();

        System.out.println("Removed first element: " + deque.removeFirst());

        deque.printDeque();

        System.out.println("Removed last element: " + deque.removeLast());

        deque.printDeque();

        System.out.println("Peeked first element: " + deque.peekFirst());

        System.out.println("Peeked last element: " + deque.peekLast());
    }
}

