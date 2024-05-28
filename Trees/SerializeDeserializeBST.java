/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null){
            return " ";
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        StringBuilder sb = new StringBuilder();
        
        while(!queue.isEmpty()){
            TreeNode current = queue.poll();
            
            if(current != null){
                sb.append(current.val + " ");
                queue.add(current.left);
                queue.add(current.right);
            } else {
                sb.append("null ");
            }
        }
        return sb.toString();
    }
    
    /*
    
            10
            /\
           8  15
           
           sb = "10 8 15 "
    
    */
    

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.equals(" ")) {
            return null;
        }

        String[] nodes = data.split(" ");
        TreeNode root = new TreeNode(Integer.valueOf(nodes[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (i < nodes.length) {
            TreeNode parent = queue.poll();
            if (!nodes[i].equals("null")) {
                parent.left = new TreeNode(Integer.valueOf(nodes[i]));
                queue.add(parent.left);
            }
            i++;

            if (i < nodes.length && !nodes[i].equals("null")) {
                parent.right = new TreeNode(Integer.valueOf(nodes[i]));
                queue.add(parent.right);
            }
            i++;
        }

        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;
