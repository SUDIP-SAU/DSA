class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ArrayList<ListNode> list = new ArrayList<>();

        ListNode temp = head;

        while (temp != null) {
            list.add(temp);
            temp = temp.next;
        }

        int size = list.size();
        int removeIndex = size - n;

        if (removeIndex == 0)
            return head.next;

        ListNode prev = list.get(removeIndex - 1);
        prev.next = prev.next.next;

        return head;
    }
}