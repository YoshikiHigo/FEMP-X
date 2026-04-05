package equivalent;

public class ClonePair5916 {
    int method1(Comparable a, Comparable b) {
        int result;
        if (a != null && b != null) {
            result = a.compareTo(b);
        } else if (a == null && b != null) {
            result = -1;
        } else if (b == null && a != null) {
            result = 1;
        } else {
            result = 0;
        }
        return result;
    }

    int method2(Comparable a, Comparable b) {
        if ((a == null) || (b == null)) {
            if (a == b) {
                return 0;
            }
            if (a == null) {
                return -1;
            }
            return 1;
        }
        return a.compareTo(b);
    }
}
