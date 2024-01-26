package SwapNodes;

class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode slow = node;
        ListNode fast = node;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        ListNode node1 = fast;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        ListNode node2 = slow.next;
        int temp = node1.val;
        node1.val = node2.val;
        node2.val = temp;

        return node.next;
    }
}
