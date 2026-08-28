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
    private void invert(TreeNode root){
        if(root.left == null && root.right == null) return;
        TreeNode t1 = new TreeNode();
        TreeNode t2 = new TreeNode();
        if(root.left == null){
            t1 = null;
        }else{
            t1 = root.left;
        }

        if(root.right == null){
            t2 = null;
        }else{
            t2 = root.right;
        }

        root.left = t2;
        root.right = t1;

        if(root.left != null) invert(root.left);
        if(root.right != null) invert(root.right);
        return;
    }
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        invert(root);
        return root;
    }
}