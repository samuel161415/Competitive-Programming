 List<Integer> list=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
       result(root,list);
        return list;
    }
    public void result(TreeNode root, List<Integer> list){
        if(root==null) return;
        list.add(root.val);
        result(root.left,list);
        result(root.right,list);
    }
