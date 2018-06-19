package tree;

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
    }
}