
class Solution {
    public boolean isSymmetric(TreeNode root) {
        mirror(root.right);
        return isSameTree(root.left,root.right);
    }
    boolean isSameTree(TreeNode p, TreeNode q) {
      if(p==null && q==null) return true;
      if(p==null || q==null) return false;
      if(p.val != q.val) return false;
      return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
    void mirror(TreeNode root) {
        if(root==null) return;
        TreeNode temp =root.left;
        root.left=root.right;
        root.right=temp;
        mirror(root.left);
        mirror(root.right);
        
        
    }
}