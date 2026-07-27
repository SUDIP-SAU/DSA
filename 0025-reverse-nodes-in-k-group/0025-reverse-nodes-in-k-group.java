class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || k == 1)
            return head;

        int length = 0;
        ListNode temp = head;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGroup = dummy;
        ListNode curr = head;

        while (length >= k) {

            ListNode prev = null;
            ListNode groupHead = curr;

            for (int i = 0; i < k; i++) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            prevGroup.next = prev;

            groupHead.next = curr;

            prevGroup = groupHead;

            length -= k;
        }

        return dummy.next;
    }
}