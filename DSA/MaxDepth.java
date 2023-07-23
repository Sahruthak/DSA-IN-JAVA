class MaxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0; // Base case: an empty tree has a depth of 0.
        }

        int leftDepth = maxDepth(root.left);   // Calculate the maximum depth of the left subtree.
        int rightDepth = maxDepth(root.right); // Calculate the maximum depth of the right subtree.

        // Return the maximum depth between the left and right subtrees, plus one for the current node.
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
