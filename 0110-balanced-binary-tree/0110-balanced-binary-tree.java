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
    boolean isBal = true;
    public boolean isBalanced(TreeNode root) {
        helper(root);
        return isBal;
    }
    public int helper(TreeNode node){
        if(node == null)return 0;
        int lh = helper(node.left);
        int rh = helper(node.right);
        int gap = Math.abs(lh - rh);
        if(gap > 1) isBal = false;
        int th = Math.max(lh, rh) + 1;
        return th;
    }
}