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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            if (curr.val == subRoot.val) {
                boolean res = recurse(curr, subRoot);
                if (res)
                    return res;
            }
            if (curr.left != null) {
                stack.push(curr.left);
            }
            if (curr.right != null) {
                stack.push(curr.right);
            }
        }
        return false;
    }
    public boolean recurse(TreeNode root, TreeNode subRoot) {
        if (root == null ^ subRoot == null) {
            return false;
        }
        if (subRoot == null) {
            return true;
        }
        if(root.val != subRoot.val){
            return false;
        }
        return recurse(root.left, subRoot.left) && recurse(root.right, subRoot.right);
    }
}
