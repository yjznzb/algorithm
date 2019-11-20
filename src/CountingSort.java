public class CountingSort {

    public void sort(int[] a) {
        int length = a.length;
        if (1 >= length) {
            return;
        }
        int max = a[0];
        for (int i = 0; i < length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }

        int[] c = new int[max + 1];
        for (int i = 0; i < length; i++) {
            c[a[i]]++;
        }

        int value = 0;
        for (int i = 0; i < c.length; i++) {
            value = value + c[i];
            c[i] = value;
        }

        int[] r = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            int index = c[a[i]] - 1;
            r[index] = a[i];
            c[a[i]]--;
        }
        for (int i = 0; i < length; i++) {
            a[i] = r[i];
        }
    }
}
