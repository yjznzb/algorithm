public class BinarySearch {
    /**
     * 在数组中查找某一个值是否存在
     * @param a
     * @param value
     * @return
     */
    public boolean search(int[] a, int value) {
        // 使用快速排序对数组进行排序
        QuickSort qs = new QuickSort();
        qs.sort(a, 0, a.length - 1);

        // 二分查找
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int middle = low + ((high - low) >> 1);
            if (a[middle] > value) {
                high = middle - 1;
            } else if (a[middle] < value) {
                low = middle + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
