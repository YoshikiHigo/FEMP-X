package equivalent;

public class ClonePair7196 {
    int method1(Comparable o1, Comparable o2, boolean nullBottom) {
        if (o1 == null) {
            if (o2 == null) {
                return 0;
            }
            return nullBottom ? -1 : 1;
        }
        if (o2 == null) {
            return nullBottom ? 1 : -1;
        }
        return o1.compareTo(o2);
    }

    int method2(Comparable c1, Comparable c2, boolean isNullFirst) {
        if (c1 == c2) {
            return 0;
        }
        if (c1 == null) {
            return isNullFirst ? -1 : 1;
        }
        if (c2 == null) {
            return isNullFirst ? 1 : -1;
        }
        return c1.compareTo(c2);
    }
}
