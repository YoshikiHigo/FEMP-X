package equivalent;

public class ClonePair7796 {
    boolean method1(Object o1, Object o2) {
        if (o1 == null) return o2 == null;
        else return o1.equals(o2);
    }

    boolean method2(Object o1, Object o2) {
        if (o1 == null) {
            return o2 == null;
        } else if (o2 == null) {
            return false;
        } else return o1.equals(o2);
    }
}
