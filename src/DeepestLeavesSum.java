public class DeepestLeavesSum {
    public int max = 0;
    public int ans = 0;
    public int current = 0;

    public int deepestLeavesSum(TreeNode root) {
        dfs(root, current);
        return ans;
    }

    public void dfs(TreeNode t1, int current) {
        if (t1==null)
            return;
        if (current == max)
            ans += t1.val;
        if (current > max) {
            ans = 0;
            max = current;
            ans += t1.val;
        }
         dfs(t1.left,current+1);
         dfs(t1.right,current+1);
    }
}
//1302. Deepest Leaves Sum
//Given the root of a binary tree, return the sum of values of its deepest leaves.
//
//
//Example 1:
//
//Input: root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
//Output: 15
//Example 2:
//
//Input: root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
//Output: 19
//
//
//Constraints:
//
//The number of nodes in the tree is in the range [1, 104].
//        1 <= Node.val <= 100