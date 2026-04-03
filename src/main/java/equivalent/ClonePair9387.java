package equivalent;

public class ClonePair9387 {
    int method1(int[] a_dim) {
        int elements = a_dim[0];
        for (int i = 1; i < a_dim.length; i++) {
            elements = elements * a_dim[i];
        }
        return elements;
    }

    int method2(int[] sizes) {
        int total = sizes[0];
        for (int i = 1; i < sizes.length; i++) total = sizes[i] * total;
        return total;
    }
}
