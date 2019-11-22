import java.util.Random;

public class SortMain {

    public static void main (String[] args) {
        int[] a = new int[1000];
        Random r = new Random(1);
        for (int i = 0; i < 1000; i++) {
            a[i] = r.nextInt(10000);
        }
        printArray(a);
        //MergeSort ms = new MergeSort();
        QuickSort qs = new QuickSort();
        qs.sort(a, 0, 999);
        //CountingSort cs = new CountingSort();
        //cs.sort(a);
//        InertionSort is = new InertionSort();
//        is.sort(a);
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.searchFirstGreater(a,56));
        System.out.println(bs.searchLastSmaller(a, 15));
        printArray(a);
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "|");
        }
        System.out.println();
    }

}
