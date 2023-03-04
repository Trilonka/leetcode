package medium;

/**
 You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

 You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class problem_0002 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode moveHead = result;
        int carry = 0;
        while (l1!=null || l2!=null) {
            moveHead.next = new ListNode(); moveHead = moveHead.next;
            int currentSum = carry;
            if (l1!=null) {
                currentSum += l1.val; l1 = l1.next;
            }
            if (l2!=null) {
                currentSum += l2.val; l2 = l2.next;
            }
            moveHead.val = currentSum%10; carry = currentSum/10;
        }
        if (carry > 0) {
            moveHead.next = new ListNode(carry);
        }
        return result.next;
    }
}
