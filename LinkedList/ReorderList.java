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
    public void reorderList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        
        ListNode temp = head;
        int length = 0;
        
        while(temp != null){
            stack.push(temp);
            temp = temp.next;
            length++;
        }
        
        ListNode current = head;
        
        for(int i=0; i<length/2; i++){
            ListNode tail = stack.pop();
            
            tail.next = current.next;
            current.next = tail;
            current = tail.next;

        }
        current.next = null;
    }
}