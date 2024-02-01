package RemoveDuplicates;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode currentNode = head;
        ListNode nextNode = head.next;

        while (nextNode != null) {
            if (currentNode.val == nextNode.val) {
                currentNode.next = nextNode.next;
            } else {
                currentNode = currentNode.next;
            }
            nextNode = nextNode.next;

        }
        return head;
    }
}
