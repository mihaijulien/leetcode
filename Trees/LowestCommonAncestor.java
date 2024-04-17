/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode current = root;

        while (current != null) {
            if (p.val > current.val && q.val > current.val){ // go to the right subtree
                current = current.right;
            } else if (p.val < current.val && q.val < current.val) {  // go to the left subtree
                current = current.left;
            } else {
                return current;
            }
        }
        return root;
    }
}