package equivalent;

public class ClonePair9903 {
    int method1(int[] polje) {
        int min = polje[0];
        for (int i = 1; i < polje.length; i++) {
            if (polje[i] < min) min = polje[i];
        }
        return min;
    }

    int method2(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }
}
