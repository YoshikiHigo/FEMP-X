package equivalent;

public class ClonePair9756 {
    boolean method1(char[] a, char[] b) {
        if (a == b) return true;
        if ((a == null) || (b == null)) return false;
        int i = a.length;
        if (b.length != i) return false;
        while (--i >= 0) if (a[i] != b[i]) return false;
        return true;
    }

    boolean method2(char[] a, char[] b) {
        if (null == a) {
            return null == b;
        } else if (null == b) return false;
        else {
            if (a.length == b.length) {
                for (int cc = 0, count = a.length; cc < count; cc++) {
                    if (a[cc] != b[cc]) return false;
                }
                return true;
            } else return false;
        }
    }
}
