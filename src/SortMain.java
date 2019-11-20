import java.util.Random;

public class SortMain {

    public static void main (String[] args) {
        int[] a = new int[10000];
        Random r = new Random(1);
        for (int i = 0; i < 10000; i++) {
            a[i] = r.nextInt(100);
        }
        printArray(a);
        //MergeSort ms = new MergeSort();
        //QuickSort qs = new QuickSort();
        //qs.sort(a, 0, 999);
        //CountingSort cs = new CountingSort();
        //cs.sort(a);
        InertionSort is = new InertionSort();
        is.sort(a);
        printArray(a);
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "|");
        }
        System.out.println();
    }

}
