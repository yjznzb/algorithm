public class InertionSort {

    public void sort(int[] a) {
        int length = a.length;
        if (1 >= length) {
            return;
        }

        for (int i = 1; i < length; i ++) {
            int j = i - 1;
            int value = a[i];
            for (; j >= 0; j--) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = value;
        }
    }
}
