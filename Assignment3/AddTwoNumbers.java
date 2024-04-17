package Assignment3;

public class AddTwoNumbers {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            current.next = new ListNode(sum % 10);
            carry = sum / 10;
            current = current.next;
        }

        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummyHead.next;
    }

    // Utility method to print a linked list
    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AddTwoNumbers adder = new AddTwoNumbers();

        // Create two linked lists representing numbers
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // Print the input linked lists
        System.out.println("First number:");
        adder.printList(l1);
        System.out.println("Second number:");
        adder.printList(l2);

        // Add the numbers
        ListNode sum = adder.addTwoNumbers(l1, l2);

        // Print the sum
        System.out.println("Sum:");
        adder.printList(sum);
    }
}

