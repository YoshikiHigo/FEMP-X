package equivalent;

public class ClonePair4830 {
    boolean method1(Object a, Object b, boolean nullsAreEqual) {
        if (nullsAreEqual) {
            return (((a == null) && (b == null)) || ((a != null) && (a.equals(b))));
        } else {
            return ((a != null) && (a.equals(b)));
        }
    }

    boolean method2(Object a, Object b, boolean nullsAreEqual) {
        if (nullsAreEqual) {
            return (((a == null) && (b == null)) || ((a != null) && (a.equals(b))));
        } else {
            return ((a != null) && (a.equals(b)));
        }
    }
}
