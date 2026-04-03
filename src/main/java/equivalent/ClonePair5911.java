package equivalent;

public class ClonePair5911 {
    @SuppressWarnings("unchecked")
    int method1(Comparable c1, Comparable c2) {
        if (c1 == c2) return (0);
        if (c1 == null) return (-1);
        if (c2 == null) return (1);
        return (c1.compareTo(c2));
    }

    int method2(Comparable left, Comparable right) {
        if (left != null) {
            if (right != null) {
                return left.compareTo(right);
            } else {
                return 1;
            }
        } else {
            if (right == null) {
                return 0;
            } else {
                return -1;
            }
        }
    }
}
