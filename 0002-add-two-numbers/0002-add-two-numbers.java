class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode l3 = new ListNode();
        ListNode temp = l3;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int val1 = 0;
            int val2 = 0;

            if (l1 != null)
                val1 = l1.val;

            if (l2 != null)
                val2 = l2.val;

            int sum = val1 + val2 + carry;

            int digit = sum % 10;
            carry = sum / 10;

            temp.val = digit;

            if (l1 != null)
                l1 = l1.next;

            if (l2 != null)
                l2 = l2.next;

            if (l1 != null || l2 != null || carry != 0) {
                temp.next = new ListNode();
                temp = temp.next;
            }
        }

        return l3;
    }
}