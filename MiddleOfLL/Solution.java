package MiddleOfLL;

class Solution {
    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode odd = head;
        ListNode even = head;

        while (even != null && even.next != null) {
            odd = odd.next;
            even = even.next.next;
        }

        System.out.println(odd.val);

        return odd;
    }
}