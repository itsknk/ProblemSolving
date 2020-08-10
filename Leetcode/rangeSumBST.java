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
    public int rangeSumBST(TreeNode root, int L, int R) {
        int sum = 0;
        if(root == null){
            return sum;
        }
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode node = st.pop();
            if(node != null){
                if(node.val >= L && node.val <=R){
                    sum += node.val;
                }
                if(node.val > L){
                    st.push(node.left);
                }
                if(node.val<R){
                    st.push(node.right);
                }
            }
        }
        return sum;
    }
}
