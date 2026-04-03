package equivalent;

public class ClonePair3651 {
    int method1(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        if (s1 == null) {
            return s2 == null ? 0 : -1;
        } else {
            if (s2 == null) {
                return 1;
            } else {
                return s1.compareTo(s2);
            }
        }
    }

    int method2(Object arg0, Object arg1) {
        String aName = (String) arg0;
        String bName = (String) arg1;
        if ((aName == null) && (bName == null)) {
            return 0;
        }
        if ((aName != null) && (bName == null)) {
            return 1;
        }
        if ((aName == null) && (bName != null)) {
            return -1;
        }
        return aName.compareTo(bName);
    }
}
