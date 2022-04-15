 public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int h1=height(root.left);
        int h2=height(root.right);
        return Math.abs(h2-h1)<=1&&isBalanced(root.left)&&isBalanced(root.right);
    }
    public int height(TreeNode root){
        if(root==null) return 0;
        return Math.max(height(root.left),height(root.right))+1;
        
    }
