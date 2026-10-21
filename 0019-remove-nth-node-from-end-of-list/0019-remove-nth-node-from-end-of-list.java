class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int i = 0;

        while (temp != null) {
            temp = temp.next;
            i++;
        }

        // Remove head
        if (n == i) {
            return head.next;
        }

        temp = head;

        for (int j = 0; j < i - n - 1; j++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }
}