package Assignment6;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues<T> {

    private Queue<T> queue1;
    private Queue<T> queue2;

    public StackUsingQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(T data) {
        
        queue1.add(data);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
       
        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }
       
        T popped = queue1.remove();
      
        Queue<T> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return popped;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        
        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }
      
        T peeked = queue1.peek();
      
        queue2.add(queue1.remove());
        
        Queue<T> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return peeked;
    }

    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueues<Integer> stack = new StackUsingQueues<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Peeked element: " + stack.peek());
    }
}

