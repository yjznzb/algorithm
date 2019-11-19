public class MergeSort {
    public void sort(int[] a, int begin_index, int end_index) {
        int length = a.length;
        if (1 >= length) {
            return;
        }
        if (begin_index >= end_index) {
            return;
        }
        int middle = (begin_index + end_index) / 2;
        sort(a, begin_index, middle);
        sort(a, middle + 1, end_index);
        merge(a, begin_index, middle, end_index);
    }

    /**
     * 合并两个数组
     * @param a
     * @param begin_index
     * @param middle
     * @param end_index
     */
    private void merge(int[] a, int begin_index, int middle, int end_index) {
        int[] b = new int[end_index - begin_index + 1];

        int i = begin_index;
        int j = middle + 1;
        int index = 0;

        while (i <= middle && j <= end_index) {
            if (a[i] <= a[j]) {
                b[index++] = a[i++];
            } else {
                b[index++] = a[j++];
            }
        }
        int start = (i > middle ? j : i);
        int end = (i > middle ? end_index : middle);
        while (start <= end) {
            b[index++] = a[start++];
        }
        for (int m = 0; m <= end_index - begin_index; m++) {
            a[begin_index + m] = b[m];
        }
    }
}
