package equivalent;

public class ClonePair7638 {
    boolean method1(Object lhs, Object rhs) {
        if (lhs == rhs) {
            return true;
        }
        if (lhs == null || rhs == null) {
            return false;
        }
        return lhs.getClass().equals(rhs.getClass());
    }

    boolean method2(Object left, Object right) {
        if (left == right) return true;
        if (left == null || right == null) return false;
        return left.getClass() == right.getClass();
    }
}
