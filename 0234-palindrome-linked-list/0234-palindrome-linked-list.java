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
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head ; 
        Stack<Integer> s = new Stack<>(); 
        Stack<Integer> st = new Stack<>(); 


        while (temp!= null)
        { s.push(temp.val);
        temp = temp.next ;
        }

        while(!s.empty()) 
        { st.push(s.pop());}
          
        temp = head ; 
        while (temp!= null)
        { s.push(temp.val);
        temp = temp.next ;
        }
        if (s.equals(st)) { return true ; }
        else { return false ;}



        
    }
}