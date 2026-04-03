package inequivalent;

public class ClonePair7834 {

    boolean method1(Object obj1, Object obj2) {
        if (obj1 == null) return (obj2 == null);
        return (obj1.equals(obj2));
    }

    boolean method2(Object value, Object target) {
        if ((value == null) && (target == null)) {
            return true;
        } else if ((value == null) || (target == null)) {
            return false;
        } else if (value.equals(target)) {
            return true;
        } else {
            return value.toString().equals(target.toString());
        }
    }
}
