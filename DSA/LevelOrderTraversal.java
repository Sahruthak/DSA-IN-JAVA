class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>(); 
        q.offer(root); 
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new LinkedList<>();
            while(size-- > 0){
                if(q.peek().left != null) q.offer(q.peek().left);
                if(q.peek().right != null) q.offer(q.peek().right);
                level.add(q.poll().val);
            }
            ans.add(level);
        }
        return ans;
    }
}
