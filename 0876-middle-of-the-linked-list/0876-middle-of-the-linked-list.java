class Solution {
    public ListNode middleNode(ListNode head) {

        ArrayList<ListNode> list = new ArrayList<>();

        while (head != null) {
            list.add(head);
            head = head.next;
        }

        return list.get(list.size() / 2);
    }
}