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
        
        if(head == null || head.next == null){
            return true;
        }
        
        Stack<Integer> palindrome = new Stack<>();
        int listLength = 0;
        ListNode curr = head;
        
        while(curr != null){
            listLength++;
            curr = curr.next;
        }
        
        curr = head;
        int counter = 0;
        
        while(curr != null){
            if(counter < listLength / 2){
                palindrome.push(curr.val);
            }
            if(counter >= listLength / 2){
                if(curr.val == palindrome.peek()){
                    palindrome.pop();
                }
            }
            counter++;
            curr = curr.next;
        }
        
        return palindrome.isEmpty();
    }
}