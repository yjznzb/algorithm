import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
}
