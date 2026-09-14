class Solution {
     List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>ans=new ArrayList<>() ; 
        display(root,ans);
        return ans;
        
    }
    void display(TreeNode root,List<Integer>ans){
        if(root==null)return;
        
        display(root.left,ans);
        ans.add(root.val);
        display(root.right,ans);

    }
    
}