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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head == null || head.next == null){
            return null;
        }
        
        ListNode nth = head;
        ListNode curr = head;
        
        for(int i=0; i<n; i++){
            nth = nth.next;
        }
        
        if (nth == null) {
            return head.next;
        }
        
        while(nth.next != null){ 
            curr = curr.next;
            nth = nth.next;
        }
        
        curr.next = curr.next.next;
        
        return head;
    }
}

class Solution2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int listLength = 0;
        ListNode curr = head;
        
        while(curr != null){
            listLength++;
            curr = curr.next;
        }
        
        if(listLength == n){
            return head.next;
        }
        
        int counter = 0;
        curr = head;
        
        while(n != listLength - counter - 1){
            curr = curr.next;
            counter++;
        }
        
        curr.next = curr.next.next;
        
        return head;
    }
}