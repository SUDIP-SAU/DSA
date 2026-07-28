class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null)
            return head;

        int length = 0;
        ListNode temp = head;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        k %= length;

        while (k-- > 0) {

            ListNode prev = null;
            ListNode curr = head;

            while (curr.next != null) {
                prev = curr;
                curr = curr.next;
            }

            prev.next = null;
            curr.next = head;
            head = curr;
        }

        return head;
    }
}