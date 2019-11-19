public class QuickSort {
    public void sort(int[] a, int begin_index, int end_index) {
        int length = a.length;
        if (1 >= length) {
            return;
        }
        if (begin_index >= end_index) {
            return;
        }
        int i = partition(a, begin_index, end_index);
        sort(a, begin_index, i - 1);
        sort(a, i + 1, end_index);
    }

    /**
     * 分区
     * @param a
     * @param begin_index
     * @param end_index
     * @return
     */
    private int partition(int[] a, int begin_index, int end_index) {
        int p = a[end_index];
        int i = begin_index;
        for (int j = begin_index; j <= end_index; j++) {
            if (a[j] < p) {
                int tmp = a[j];
                a[j] = a[i];
                a[i] = tmp;
                i++;
            }
        }
        a[end_index] = a[i];
        a[i] = p;
        return i;
    }
}
