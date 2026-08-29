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

    Map<Integer, Integer> map = new HashMap<>();
    int idx = 0;

    private TreeNode getNode(int[] preorder, int low, int high) {
        if (low > high)
            return null;
        TreeNode node = new TreeNode(preorder[idx]);
        idx++;

        int id = map.get(node.val);
        node.left = getNode(preorder, low, id - 1);
        node.right = getNode(preorder, id + 1, high);

        return node;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return getNode(preorder, 0, inorder.length - 1);
    }
}