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
    public ListNode partition(ListNode head, int x) {
        ListNode before = new ListNode(0);
        ListNode after = new ListNode(0);
        
        ListNode beforeCurrent = before;
        ListNode afterCurrent = after;
        
        while(head != null) {
            if(head.val < x) {
                beforeCurrent.next = head;
                beforeCurrent = beforeCurrent.next;
            } else {
                afterCurrent.next = head;
                afterCurrent = afterCurrent.next;
            }
            head = head.next;
        }
        
        afterCurrent.next = null;
        beforeCurrent.next = after.next;
        
        return before.next;
    }
}
