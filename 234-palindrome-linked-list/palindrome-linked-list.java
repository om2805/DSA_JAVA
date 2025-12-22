class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = reverse(slow.next);
        ListNode first = head;

        while (second != null) {
            if (first.val != second.val) return false;
            first = first.next;
            second = second.next;
        }

        return true;
    }

    static ListNode reverse(ListNode head) {
        ListNode cur = head;
        ListNode prv = null;

        while (cur != null) {
            ListNode fr = cur.next;
            cur.next = prv;
            prv = cur;
            cur = fr;
        }
        return prv;
    }
}
