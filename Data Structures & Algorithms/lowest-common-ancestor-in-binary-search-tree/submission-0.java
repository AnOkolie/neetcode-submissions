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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        boolean nodeP = false;
        boolean nodeQ = false;
        return recurse(root,p,q,nodeP);
    }
    public TreeNode recurse(TreeNode root, TreeNode p, TreeNode q, boolean found){
        if(root == null){
            return null;
        }
        TreeNode left = recurse(root.left,p,q,found);
        TreeNode right = recurse(root.right,p,q,found);
        if(right == null && left == null){
            if(root == p || root == q){
                return root;
            }
            return null;
        }
        if(left == null ^ right == null){
            if(root == p || root == q){
                return root;
            }
            return left == null ? right : left;
        }
        return root;
    }
}
