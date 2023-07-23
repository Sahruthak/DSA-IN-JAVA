class Sametree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true; // Both trees are empty, so they are the same.
        }

        if (p == null || q == null) {
            return false; // One tree is empty while the other is not, so they are different.
        }

        // Check if the current nodes have the same value and recursively compare their left and right subtrees.
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
