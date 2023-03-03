package medium;

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
