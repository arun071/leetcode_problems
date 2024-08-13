public class MinDepthTree {
    public int Depth(TreeNode root) {

        int left = 0;
        int right = 0;
        if (root == null)
            return 0;
        if (root.left != null && root.right != null) {
            left = 1 + Depth(root.left);
            right = Depth(root.right);
        }
        return left + right;
    }

    public int minDepth(TreeNode root) {
        int count = minDepth(root);
        return count;
    }
}
