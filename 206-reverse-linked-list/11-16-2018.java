/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        // dummy->1->2->3->null
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        while (head.next != null) {
            ListNode temp = dummy.next;
            dummy.next = head.next;
            head.next = head.next.next;
            dummy.next.next = temp;
        }
        return dummy.next;
        
        
    }
}
