package data_structure_1;

/**
 * Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
 */
public class problem_0203 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode result = new ListNode();
        result.next = head;
        ListNode movingHead = result;
        while (movingHead.next != null) {
            if (movingHead.next.val == val) {
                movingHead.next = movingHead.next.next;
            } else {
                movingHead = movingHead.next;
            }
        }
        return result.next;
    }
}
