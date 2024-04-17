package Assignment3;

public class PalindromeLinkedList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public boolean isPalindrome(ListNode head) {
        // Edge case: Empty list or single node list
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: Traverse the linked list and store values in a stack
        ListNode slow = head;
        ListNode fast = head;
        java.util.Stack<Integer> stack = new java.util.Stack<>();

        while (fast != null && fast.next != null) {
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        // If the list has odd number of elements, skip the middle element
        if (fast != null) {
            slow = slow.next;
        }

        // Step 2: Compare values from the stack with the rest of the linked list
        while (slow != null) {
            int top = stack.pop();
            if (top != slow.val) {
                return false; // Not a palindrome
            }
            slow = slow.next;
        }

        return true; // Palindrome
    }

    public static void main(String[] args) {
        PalindromeLinkedList checker = new PalindromeLinkedList();

        // Create a sample linked list for testing
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        boolean isPalindrome = checker.isPalindrome(head);
        if (isPalindrome) {
            System.out.println("Linked list is a palindrome.");
        } else {
            System.out.println("Linked list is not a palindrome.");
        }
    }
}
