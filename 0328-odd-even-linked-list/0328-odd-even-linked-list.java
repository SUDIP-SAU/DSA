class Solution {
    public ListNode oddEvenList(ListNode head) {

        if (head == null)
            return null;

        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        ListNode temp = head;
        int pos = 1;

        while (temp != null) {

            if (pos % 2 == 1)
                odd.add(temp.val);
            else
                even.add(temp.val);

            temp = temp.next;
            pos++;
        }

        temp = head;

        for (int num : odd) {
            temp.val = num;
            temp = temp.next;
        }

        for (int num : even) {
            temp.val = num;
            temp = temp.next;
        }

        return head;
    }
}