class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if (head == null || head.next == null) {
            return head;
        }

        ListNode curr = head;
        ListNode next = head.next;

    
        while(next != null) {

            if(curr.val == next.val) {

                curr.next = next.next;
                next = curr.next;

                
            }

            else{

            curr = curr.next;
            next = next.next;
            }
        }

        return head;
    }
}