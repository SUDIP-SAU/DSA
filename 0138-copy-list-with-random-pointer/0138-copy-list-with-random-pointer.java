class Solution {
    public Node copyRandomList(Node head) {

        if (head == null)
            return null;

        HashMap<Node, Node> map = new HashMap<>();

        Node dummy = new Node(0);
        Node copyTail = dummy;
        Node curr = head;

        while (curr != null) {

            Node newNode = new Node(curr.val);

            map.put(curr, newNode);

            copyTail.next = newNode;
            copyTail = newNode;

            curr = curr.next;
        }

        curr = head;
        Node copy = dummy.next;

        while (curr != null) {

            copy.random = map.get(curr.random);

            curr = curr.next;
            copy = copy.next;
        }

        return dummy.next;
    }
}