package equivalent;

public class ClonePair7604 {
    boolean method1(Object apple, Object orange) {
        if (apple == null && orange == null) {
            return true;
        }
        if (apple == null || orange == null) {
            return false;
        }
        return (apple.equals(orange) && orange.equals(apple));
    }

    boolean method2(Object o1, Object o2) {
        if (o1 == null && o2 == null) return true;
        if (o1 == null || o2 == null) return false;
        return o1.equals(o2);
    }
}
