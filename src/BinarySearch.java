public class BinarySearch {
    /**
     * 在数组中查找某一个值是否存在,并返回该值的数组下标
     * @param a
     * @param value
     * @return
     */
    public int search(int[] a, int value) {
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
                return middle;
            }
        }
        return -1;
    }

    /**
     * 查找第一个值等于target的值，并返回数组下表，如果数组中不存在该值，返回-1
     * @param a
     * @param target
     * @return
     */
    public int searchFirst(int[] a, int target) {
        int length = a.length;
        if (0 == length) {
            return -1;
        }

        int low = 0;
        int high = length - 1;
        int value = -1;

        while (low <= high) {
            int middle = low + ((high - low) >> 1);
            if (a[middle] > target) {
                high = middle - 1;
            } else if (a[middle] < target) {
                low = middle + 1;
            } else {
                if (middle == 0 || a[middle - 1] != target) {
                    value = middle;
                    break;
                } else {
                    high = middle - 1;
                }
            }
        }

        return value;
    }

    /**
     * 数组a中最后一个值为target的数组下标
     * @param a
     * @param target
     * @return
     */
    public int searchLast(int[] a, int target) {
        if (a.length == 0) {
            return -1;
        }

        int low = 0;
        int high = a.length - 1;
        int value = -1;

        while (low <= high) {
            int middle = low + ((high - low) >> 1);
            if (a[middle] > target) {
                high = middle - 1;
            } else if (a[middle] < target) {
                low = middle + 1;
            } else {
                if (middle == a.length - 1 || a[middle + 1] != target) {
                    value = middle;
                    break;
                } else {
                    low = middle + 1;
                }
            }
        }

        return value;
    }

    /**
     * 查找数组中第一个大于等于给定值的元素下标，如果不存在返回-1
     * @param a
     * @param target
     * @return
     */
    public int searchFirstGreater(int[] a, int target) {

        if (0 == a.length) {
            return -1;
        }

        int low = 0;
        int high = a.length - 1;
        int value = -1;

        while (low <= high) {
            int middle = low + ((high - low) >> 1);

            if (a[middle] < target) {
                low = middle + 1;
            } else {
                if (middle == 0 || a[middle - 1] < target) {
                    value = middle;
                    break;
                } else {
                    high = middle - 1;
                }
            }
        }

        return value;
    }

    /**
     * 查找数组中小于等于给定值的最后一个元素的小标，如果不存在返回-1
     * @param a
     * @param target
     * @return
     */
    public int searchLastSmaller(int[] a, int target) {
        if (a[0] > target) {
            return -1;
        }

        int low = 0;
        int high = a.length - 1;
        int value = -1;

        while (low <= high) {
            int middle = low + ((high - low) >> 1);
            if (a[middle] > target) {
                high = middle - 1;
            } else {
                if (middle == a.length - 1 || a[middle + 1] > target) {
                    value = middle;
                    break;
                } else {
                    low = middle + 1;
                }
            }
        }

        return value;
    }
}
