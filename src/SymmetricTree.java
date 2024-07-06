public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return dfs(root.left,root.right);
    }

    public static boolean dfs(TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 == null)
            return true;
        if (n1 == null || n2 == null)
            return false;
        if (n1.val!=n2.val)
            return false;
        return dfs(n1.left,n2.right)&&dfs(n1.right,n2.left);
    }

}
//   101. Symmetric Tree
//Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
//
//
//
//Example 1:
//
//
//Input: root = [1,2,2,3,4,4,3]
//Output: true
//Example 2:
//
//
//Input: root = [1,2,2,null,3,null,3]
//Output: false
//
//
//Constraints:
//
//The number of nodes in the tree is in the range [1, 1000].
//        -100 <= Node.val <= 100
//
//
//Follow up: Could you solve it both recursively and iteratively?