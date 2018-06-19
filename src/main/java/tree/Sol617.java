package tree;

import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */


class Sol617 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        } else if (t1 != null && t2 == null) {
            TreeNode t = new TreeNode(t1.val);
            t.left = mergeTrees(t1.left, null);
            t.right = mergeTrees(t1.right, null);
            return t;
        } else if (t1 == null && t2 != null) {
            TreeNode t = new TreeNode(t2.val);
            t.left = mergeTrees(null, t2.left);
            t.right = mergeTrees(null, t2.right);
            return t;
        } else if (t1 != null && t2 != null) {
            TreeNode t = new TreeNode(t1.val + t2.val);
            t.left = mergeTrees(t1.left, t2.left);
            t.right = mergeTrees(t1.right, t2.right);
            return t;
        }
        return null;
    }

    public static TreeNode mergeTrees2(TreeNode t1, TreeNode t2) {
        if (t1 == null)
            return t2;
        if (t2 == null)
            return t1;
        t1.val += t2.val;
        t1.left = mergeTrees2(t1.left, t2.left);
        t1.right = mergeTrees2(t1.right, t2.right);
        return t1;
    }

    public static TreeNode mergeTrees3(TreeNode t1, TreeNode t2) {
        if (t1 == null)
            return t2;
        Stack< TreeNode[] > stack = new Stack < > ();
        stack.push(new TreeNode[] {t1, t2});
        while (!stack.isEmpty()) {
            TreeNode[] t = stack.pop();
            if (t[0] == null || t[1] == null) {
                continue;
            }
            t[0].val += t[1].val;
            if (t[0].left == null) {
                t[0].left = t[1].left;
            } else {
                stack.push(new TreeNode[] {t[0].left, t[1].left});
            }
            if (t[0].right == null) {
                t[0].right = t[1].right;
            } else {
                stack.push(new TreeNode[] {t[0].right, t[1].right});
            }
        }
        return t1;
    }

    public static void main(String[] args) {
//        [1,2,null,3]
//        [1,null,2,null,3]
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.left.left = new TreeNode(3);
        TreeNode t2 = new TreeNode(1);
        t2.right = new TreeNode(2);
        t2.right.right = new TreeNode(3);

        TreeNode t = mergeTrees(t1, t2);
        TreeNode tt = mergeTrees2(t1, t2);
        TreeNode ttt = mergeTrees3(t1, t2);
    }
}