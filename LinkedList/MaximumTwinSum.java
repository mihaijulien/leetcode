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
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        List<Integer> vals = new ArrayList<>();
        
        // half list
        while(fast != null && fast.next != null){
            vals.add(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        
        int i = vals.size()-1;
        int twinSum = 0;
        // continue from half onward
        while(slow != null){
            twinSum = Math.max(twinSum, slow.val + vals.get(i));
            slow = slow.next;
            i--;
        }
        
        return twinSum;
    }
}