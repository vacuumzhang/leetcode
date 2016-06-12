package leetcode;

public class MaximumDepthOfBinaryTree {
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
//recursive
//f(n) = 0; n=null, 
//f(n) = 1+ max(f(n左)， f(n右)) 
	public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        return Math.max(left, right) + 1;
        
    }
}
