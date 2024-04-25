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
    
    List<String> currentPath = new ArrayList<>();
    List<String> allPaths = new ArrayList<>();
    
    public List<String> binaryTreePaths(TreeNode root) {
        depthFirstSearch(root);
        
        return allPaths;
    }
    
    private void depthFirstSearch(TreeNode root){
        if(root == null){
            return;
        }
        
        currentPath.add(String.valueOf(root.val));
        
        //leaf node
        if(root.left == null && root.right == null){
            allPaths.add(String.join("->", currentPath));
        } else {
            depthFirstSearch(root.left);
            depthFirstSearch(root.right);
        }
        
        currentPath.remove(currentPath.size() - 1);
    }
}
