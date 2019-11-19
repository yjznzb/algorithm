import java.util.Random;

public class SortMain {

    public static void main (String[] args) {
        int[] a = new int[1000];
        Random r = new Random(1);
        for (int i = 0; i < 1000; i++) {
            a[i] = r.nextInt(1000);
        }
        printArray(a);
        //MergeSort ms = new MergeSort();
        QuickSort qs = new QuickSort();
        qs.sort(a, 0, 999);
        printArray(a);
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "|");
        }
        System.out.println();
    }

}
