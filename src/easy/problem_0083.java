package easy;

/**
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
 * Return the linked list sorted as well.
 */
public class problem_0083 {

    class ListNode {
        int val;
        ListNode next;
        ListNode() { }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode moving = head;
        while (moving != null && moving.next != null) {
            if (moving.next.val == moving.val) {
                moving.next = moving.next.next;
            }
            else {
                moving = moving.next;
            }
        }
        return head;
    }
}
