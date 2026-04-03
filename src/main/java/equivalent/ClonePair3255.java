package equivalent;

public class ClonePair3255 {
    int method1(Object o1, Object o2) {
        Integer iobj = (Integer) o1;
        int i1 = iobj;
        iobj = (Integer) o2;
        int i2 = iobj;
        if (i1 > i2) return 1;
        else if (i1 < i2) return -1;
        else return 0;
    }

    int method2(Object arg0, Object arg1) {
        int k0 = ((Integer) arg0).intValue();
        int k1 = ((Integer) arg1).intValue();
        if (k0 < k1) return -1;
        else if (k0 > k1) return 1;
        return 0;
    }
}
