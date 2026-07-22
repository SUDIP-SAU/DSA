class Solution {
    public ListNode sortList(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode mid = getMiddle(head);

        ListNode right = mid.next;
        mid.next = null;

        ListNode left = head;

        left = sortList(left);
        right = sortList(right);

        return merge(left, right);
    }

    private ListNode getMiddle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private ListNode merge(ListNode a, ListNode b) {

        ListNode temp = new ListNode(-1);
        ListNode tail = temp;

        while (a != null && b != null) {

            if (a.val <= b.val) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }

            tail = tail.next;
        }

        if (a != null)
            tail.next = a;

        if (b != null)
            tail.next = b;

        return temp.next;
    }
}