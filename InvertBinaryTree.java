package leetcode;

import leetcode.MaximumDepthOfBinaryTree.TreeNode;

public class InvertBinaryTree {
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	//recursive temp = left; letf = right; right = temp;
	public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        
        TreeNode temp = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = temp;
        return root;
        
        
    }

}
