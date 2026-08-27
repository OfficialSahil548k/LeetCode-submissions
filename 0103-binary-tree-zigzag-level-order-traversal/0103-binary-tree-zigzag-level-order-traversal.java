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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        int L2R = 0;
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();

            List<Integer> temp = new ArrayList<>(
                Collections.nCopies(size, 0)
            );

            int first = 0;
            int last = size - 1;
            while (size > 0) {
                TreeNode t = q.poll();

                if(L2R == 1){
                    temp.set(last,t.val);
                    last--;
                }else{
                    temp.set(first,t.val);
                    first++;
                }
                if (t.left != null) q.offer(t.left);
                if (t.right != null) q.offer(t.right);

                size--;
            }
            L2R = 1 - L2R;
            ans.add(temp);
        }

        return ans;
    }
}