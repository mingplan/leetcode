/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<String>();
		if(root==null){
			String str = null;
			list.add(str);
			return list;
		}
		dfs(root,"",list);
		return list;
    }
    public void dfs(TreeNode root,string str,List<String> list){
		if(root.right==null&&root.left==null){
			 if(str==""){
				 str = new Integer(root.val).toString();
				 list.add(str);
			 }else{
				 str = str+"->"+root.val;
				 list.add(str);
			 }
			 return ;
		}else if(root.left!=null){
			 dfs(root.left,str+"->"+root.val,list);
		}else if(root.right!=null){
			 dfs(root.right,str+"->"+root.val,list);
		}
	} 
}