/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    Stack<Integer> inOrderStack = new Stack<>();
    
    public boolean isValidBST(TreeNode root) {
        inOrder(root);
        while(!inOrderStack.isEmpty()){
            int element = inOrderStack.pop();
            
            if(inOrderStack.isEmpty()){
                return true;
            } 
            
            if(element <= inOrderStack.peek()){
                return false;
            }
        }
        return true;
    }
    
    private void inOrder(TreeNode root){
        if(root != null){
            inOrder(root.left);
            inOrderStack.push(root.val);
            inOrder(root.right);
        }
    }
}