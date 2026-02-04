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
    public static int height(TreeNode root,boolean[] ans){
        if(root==null)return 0;
        int left=height(root.left,ans);
        int right=height(root.right,ans);
        if(Math.abs(left-right)>1){
            ans[0]=false;
        }
        return 1+Math.max(left,right);
    }
    public boolean isBalanced(TreeNode root) {
        boolean[] ans={true};
        height(root,ans);
        return ans[0];
    }
}