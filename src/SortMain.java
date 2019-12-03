import java.util.Random;

public class SortMain {

    public static void main (String[] args) {
        int[] a = {3, 9, 20, 15, 7};
        int[] b = {9, 3, 15, 20, 7};
        int[] tmp = new int[2];
        System.arraycopy(b, 1, tmp, 0, 2);
        BinaryTree tree = new BinaryTree();
        BinaryTree.TreeNode root = tree.buildTree(a, b);
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "|");
        }
        System.out.println();
    }

}
