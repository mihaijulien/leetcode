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
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        
        ListNode curr = head;
        while(curr != null){
            while(!stack.isEmpty() && curr.val > stack.peek().val){
                stack.pop();
            }
            
            stack.push(curr);
            curr = curr.next;
        }
            
            // reverse linked list
            ListNode nxt = null;
            
            while(!stack.isEmpty()){
                curr = stack.pop();
                curr.next = nxt;
                nxt = curr;
            }
        return curr;
    }
}
