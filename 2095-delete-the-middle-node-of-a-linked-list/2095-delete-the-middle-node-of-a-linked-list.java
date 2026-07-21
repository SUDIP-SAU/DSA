class Solution {
    public ListNode deleteMiddle(ListNode head) {

        if(head == null || head.next == null) return null;
        
        ListNode temp = head;
        int n = 0;

        while(temp != null){

            n++;

            temp = temp.next;
        }

        int res = (n/2);

        temp = head;

        while(temp != null){

            res--;

            if(res == 0){

                temp.next = temp.next.next;
                break;
            }

            temp = temp.next;
        }
        
        return head;
    }
}