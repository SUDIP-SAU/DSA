class Solution {
    public ListNode removeElements(ListNode head, int val) {

        List<ListNode> list = new ArrayList<>();

        ListNode temp = head;

        while (temp != null) {

            if (temp.val != val)
                list.add(temp);

            temp = temp.next;
        }

        if (list.size() == 0)
            return null;

        for (int i = 0; i < list.size() - 1; i++) {
            list.get(i).next = list.get(i + 1);
        }

        list.get(list.size() - 1).next = null;

        return list.get(0);
    }
}