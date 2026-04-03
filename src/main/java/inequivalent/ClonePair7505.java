package inequivalent;

public class ClonePair7505 {

    boolean method1(Object obj1, Object obj2) {
        if ((obj1 == null && obj2 != null) || (obj2 == null && obj1 != null)) return false;
        if (obj1 == null && obj2 == null) return true;
        return obj1.equals(obj2);
    }

    boolean method2(Object a, Object b) {
        if (a == null || b == null) {
            return a == b;
        }
        if (a instanceof Double ad && b instanceof Double bd) {
            return ad.doubleValue() == bd.doubleValue();
        }
        return a == b;
    }
}
