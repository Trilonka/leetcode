package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 */
public class problem_0094 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        TreeNode movingHead = root;
        LinkedList<TreeNode> stack = new LinkedList<>();
        while (movingHead != null || stack.size() > 0) {
            while (movingHead != null) {
                stack.addLast(movingHead);
                movingHead = movingHead.left;
            }
            movingHead = stack.removeLast();
            result.add(movingHead.val);
            movingHead = movingHead.right;
        }
        return result;
    }
}
