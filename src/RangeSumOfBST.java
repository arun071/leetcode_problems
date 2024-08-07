public class RangeSumOfBST {
    public static int rangeSumBST(TreeNode root, int low, int high) {
        int ans = 0;
        if (root == null)
            return 0;
        if (root.val >= low && root.val <= high)
            ans += root.val;
        if (root.val > low)
            ans += rangeSumBST(root.left, low, high);
        if (root.val < high)
            ans += rangeSumBST(root.right, low, high);
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10, new TreeNode(5, new TreeNode(3), new TreeNode(7)), new TreeNode(15, new TreeNode(), new TreeNode(18)));
        System.out.println(rangeSumBST(root,7,15));
    }
}
//938. Range Sum of BST
//Given the root node of a binary search tree and two integers low and high, return the sum of values of all nodes with a value in the inclusive range [low, high].
//
//
//
//Example 1:
//
//
//Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
//Output: 32
//Explanation: Nodes 7, 10, and 15 are in the range [7, 15]. 7 + 10 + 15 = 32.
//Example 2:
//
//
//Input: root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
//Output: 23
//Explanation: Nodes 6, 7, and 10 are in the range [6, 10]. 6 + 7 + 10 = 23.
//
//
//Constraints:
//
//The number of nodes in the tree is in the range [1, 2 * 104].
//        1 <= Node.val <= 105
//        1 <= low <= high <= 105
//All Node.val are unique.
