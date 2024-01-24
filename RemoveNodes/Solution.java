package RemoveNodes;

public class Solution {
    public ListNode removeNodes(ListNode head) {
        if (head.next == null) {
            return head;
        }
        head.next = removeNodes(head.next);
        if (head.next.val > head.val) {
            return head.next;
        }
        return head;
    }
}
