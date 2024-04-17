package Assignment3;
public class LinkedListLoopDetector {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true; // Cycle detected
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return false; // No cycle found
    }

    public static void main(String[] args) {
        LinkedListLoopDetector detector = new LinkedListLoopDetector();

        // Create a sample linked list with a cycle
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        // Create a cycle
        node5.next = node2;

        boolean hasCycle = detector.hasCycle(head);
        if (hasCycle) {
            System.out.println("Linked list contains a cycle.");
        } else {
            System.out.println("Linked list does not contain a cycle.");
        }
    }
}
