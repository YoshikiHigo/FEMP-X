package inequivalent;

public class ClonePair7559 {

    boolean method1(Object thisObject, Object thatObject) {
        if (thisObject == null) {
            return thatObject == null;
        } else if (thatObject == null) {
            return false;
        } else return thisObject.equals(thatObject);
    }

    boolean method2(Object left, Object right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.getClass().getCanonicalName().equals(right.getClass().getCanonicalName())) {
            return left.equals(right);
        }
        return left.toString().equals(right.toString());
    }
}
