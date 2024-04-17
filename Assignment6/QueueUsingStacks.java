package Assignment6;
import java.util.Stack;

public class QueueUsingStacks<T> {

    private Stack<T> stack1;
    private Stack<T> stack2;

    public QueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(T data) {
        stack1.push(data);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        if (stack2.isEmpty()) {
          
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
      
        return stack2.pop();
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        if (stack2.isEmpty()) {
           
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
       
        return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStacks<Integer> queue = new QueueUsingStacks<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Peeked element: " + queue.peek());
    }
}
