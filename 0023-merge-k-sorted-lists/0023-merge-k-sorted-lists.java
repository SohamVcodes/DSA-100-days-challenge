/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    public ListNode mergeKLists(ListNode[] lists) {
        
        if (lists == null || lists.length == 0) {
            return null;
        }

        int last = lists.length - 1;

        while (last != 0) {
            
            int i = 0;
            int j = last;

            while (i < j) {
                
                lists[i] = mergeTwoLists(lists[i], lists[j]);

                i++;
                j--;

                if (i >= j) {
                    last = j;
                }
            }
        }

        return lists[0];
    }

    // Merge two sorted linked lists
    private ListNode mergeTwoLists(ListNode a, ListNode b) {
        
        if (a == null) {
            return b;
        }

        if (b == null) {
            return a;
        }

        if (a.val <= b.val) {
            a.next = mergeTwoLists(a.next, b);
            return a;
        } 
        else {
            b.next = mergeTwoLists(a, b.next);
            return b;
        }
    }
}
