import java.util.ArrayList;

public class IncreasingOrderSearchTree {
    ArrayList<TreeNode> list = new ArrayList<>();

    public void inorder(TreeNode treeNode) {
        if (treeNode == null)
            return;
        inorder(treeNode.left);
        list.add(treeNode);
        inorder(treeNode.right);
    }

    public TreeNode increasingBST(TreeNode root) {
        if (root == null)
            return null;
        inorder(root);
        for (int i = 0; i < list.size(); i++) {
            list.get(i).right = list.get(i + 1);
            list.get(i).left = null;
        }
        list.get(list.size() - 1).left = null;
        list.get(list.size() - 1).right = null;
        return list.get(0);
    }

    public static void main(String[] args) {

    }
}
//897. Increasing Order Search Tree
//Given the root of a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only one right child.
//
//
//
//        Example 1:
//
//
//Input: root = [5,3,6,2,4,null,8,1,null,null,null,7,9]
//Output: [1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]
//Example 2:
//
//
//Input: root = [5,1,7]
//Output: [1,null,5,null,7]
//
//
//Constraints:
//
//The number of nodes in the given tree will be in the range [1, 100].
//        0 <= Node.val <= 1000