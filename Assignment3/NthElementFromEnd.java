package Assignment3;

public class NthElementFromEnd {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public int nthFromEnd(ListNode head, int n) {
        if (head == null || n <= 0) {
            return -1; 
        }

        ListNode slow = head;
        ListNode fast = head;

      
        for (int i = 0; i < n; i++) {
            if (fast == null) {
                return -1; 
            }
            fast = fast.next;
        }

        
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

      
        return slow.val;
    }

    public static void main(String[] args) {
        NthElementFromEnd finder = new NthElementFromEnd();

        
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2; 

        int nthFromEnd = finder.nthFromEnd(head, n);
        if (nthFromEnd != -1) {
            System.out.println("The " + n + "th element from the end is: " + nthFromEnd);
        } else {
            System.out.println("Invalid input or list length is less than " + n);
        }
    }
}
