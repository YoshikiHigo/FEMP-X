package equivalent;

public class ClonePair3077 {
    int method1(Object obj, Object obj1) {
        int v1 = ((Integer) obj).intValue();
        int v2 = ((Integer) obj1).intValue();
        if (v1 < v2) return -1;
        if (v1 == v2) return 0;
        return 1;
    }

    int method2(Object sp1, Object sp2) {
        Integer a = (Integer) sp1;
        Integer b = (Integer) sp2;
        if (a.intValue() < b.intValue()) {
            return -1;
        } else if (a.intValue() == b.intValue()) {
            return 0;
        } else if (a.intValue() > b.intValue()) {
            return 1;
        }
        return -2;
    }
}
