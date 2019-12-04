import java.util.*;

public class BinaryTree {

    /**
     * 中序遍历二叉树,所谓中序遍历，就是先遍历节点的左子树，再遍历节点本身，最后再遍历节点的右子树。
     * 由于节点本身处于遍历顺序的中间，所以叫做中序遍历
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<Integer> result = new ArrayList<>();
        result.addAll(inorderTraversal(root.left));
        result.add(root.val);
        result.addAll(inorderTraversal(root.right));
        return result;
    }

    /**
     * 根据二叉树的前序和中序遍历，构建二叉树
     * @param preorder
     * @param inorder
     * @return
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (0 == preorder.length || 0 == inorder.length) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        int index = 0;
        for (;index < inorder.length; index++) {
            if (inorder[index] == preorder[0]) {
                break;
            }
        }
        int[] newPreorder = new int[index];
        int[] newInorder = new int[index];
        System.arraycopy(preorder, 1, newPreorder, 0, index);
        System.arraycopy(inorder, 0, newInorder, 0, index);
        root.left = buildTree(newPreorder, newInorder);

        newPreorder = new int[preorder.length - index - 1];
        newInorder = new int[inorder.length - index - 1];
        System.arraycopy(preorder, index + 1, newPreorder, 0, preorder.length - index - 1);
        System.arraycopy(inorder, index + 1, newInorder, 0, inorder.length - index - 1);
        root.right = buildTree(newPreorder, newInorder);

        return root;
    }

    /**
     * 判断一棵二叉树是不是二叉查找树
     * @param root
     * @return
     */
    public boolean isValidBST(TreeNode root) {
        return valid(root, null, null);
    }

    private boolean valid(TreeNode root, Integer min, Integer max) {
        if (root == null) {
            return true;
        }

        int val = root.val;
        if (min != null && val <= min) {
            return false;
        }
        if (max != null && val >= max) {
            return false;
        }

        if (!valid(root.left, min, val)) {
            return false;
        }
        if (!valid(root.right, val, max)) {
            return false;
        }

        return true;
    }

    /**
     * 求一颗二叉树的最大深度
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if (null == root) {
            return 0;
        }
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        return 1 + (lh > rh ? lh : rh);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
}
