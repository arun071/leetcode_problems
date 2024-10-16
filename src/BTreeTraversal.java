import java.util.ArrayList;
import java.util.List;

public class BTreeTraversal {
    public static void Inorder(TreeNode node, List<Integer> list) {
        if (node == null)
            return;
        Inorder(node.left, list);
        list.add(node.val);
        Inorder(node.right, list);
    }

    public static void Preorder(TreeNode node, List<Integer> list) {
        if (node == null)
            return;
        list.add(node.val);
        Preorder(node.left, list);
        Preorder(node.right, list);
    }
    public static void Postorder(TreeNode node, List<Integer> list) {
        if (node == null)
            return;
        Postorder(node.left, list);
        Postorder(node.right, list);
        list.add(node.val);

    }


    public static List<Integer> Traversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Inorder(root, ans);
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode();
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(Traversal(root));
    }
}
//94. Binary Tree Inorder Traversal
//144. Binary Tree Preorder Traversal
//145. Binary Tree Postorder Traversal

//Given the root of a binary tree, return the preorder traversal of its nodes' values.
//
//
//
//Example 1:
//
//
//Input: root = [1,null,2,3]
//Output: [1,2,3]
//Example 2:
//
//Input: root = []
//Output: []
//Example 3:
//
//Input: root = [1]
//Output: [1]
//
//
//Constraints:
//
//The number of nodes in the tree is in the range [0, 100].
//        -100 <= Node.val <= 100
//
//
//Follow up: Recursive solution is trivial, could you do it iteratively?
//
