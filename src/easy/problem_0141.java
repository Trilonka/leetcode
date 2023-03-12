package easy;

/**
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 * <p>
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following
 * the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to.
 * Note that pos is not passed as a parameter.
 * <p>
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 */
public class problem_0141 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode movingOne = head;
        ListNode movingTwo = head.next;
        while (movingOne != movingTwo) {
            if (movingOne.next == null || movingTwo.next == null || movingTwo.next.next == null) return false;
            movingOne = movingOne.next;
            movingTwo = movingTwo.next.next;
        }
        return true;
    }
}
