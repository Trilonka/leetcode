package data_structure_1;

/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 */
public class problem_0206 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) return null;

        ListNode movingHead = head.next;
        head.next = null;

        while (movingHead != null) {
            ListNode next = movingHead.next;
            movingHead.next = head;
            head = movingHead;
            movingHead = next;
        }

        return head;
    }
}
