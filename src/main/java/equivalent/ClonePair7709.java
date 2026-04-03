package equivalent;

public class ClonePair7709 {
    boolean method1(Object value1, Object value2) {
        if (value1 == null && value2 == null) {
            return true;
        }
        return value1 != null && value1.equals(value2);
    }

    boolean method2(Object obj1, Object obj2) {
        if ((obj1 != null) || (obj2 != null)) if ((obj1 != null) && (obj2 != null)) {
            return obj1.equals(obj2);
        } else return (obj1 == null) && (obj2 == null);
        return true;
    }
}
