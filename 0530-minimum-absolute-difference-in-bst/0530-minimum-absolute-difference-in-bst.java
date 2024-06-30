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
    Integer prev = null;
    int res = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        prev = null;
        inOrder(root);
        return res;
    }
    public void inOrder(TreeNode root){
        if(root == null)return;
        inOrder(root.left);
        if(prev != null){
            res = Math.min(res, root.val - prev);
        }
        prev = root.val;

        inOrder(root.right);
    }
}
