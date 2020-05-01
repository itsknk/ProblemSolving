class diaOfBinaryTree {
    private int longestPath = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        longestPath(root);
        return longestPath;
    }
        private int longestPath(TreeNode node){
            if(node == null){
                return 0;
        }
             int left = longestPath(node.left);
             int right = longestPath(node.right);
            longestPath = Math.max(longestPath, left+right);
            return Math.max(left,right)+1;
        }
        
        
    
}
