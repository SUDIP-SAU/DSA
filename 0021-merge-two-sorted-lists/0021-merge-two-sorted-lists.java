class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ArrayList<Integer> arr = new ArrayList<>();

        while (list1 != null) {
            arr.add(list1.val);
            list1 = list1.next;
        }

        while (list2 != null) {
            arr.add(list2.val);
            list2 = list2.next;
        }

        Collections.sort(arr);

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for (int value : arr) {
            curr.next = new ListNode(value);
            curr = curr.next;
        }

        return dummy.next;
    }
}