package equivalent;

public class ClonePair7242 {
    boolean method1(Object lhs, Object rhs) {
        if (null == lhs || null == rhs) return false;
        if (!(lhs instanceof Number) || !(rhs instanceof Number)) return false;
        return ((Number) lhs).doubleValue() < ((Number) rhs).doubleValue();
    }

    boolean method2(Object left, Object right) {
        if (left == null || right == null) return false;
        else {
            if (left instanceof Number leftNumber && right instanceof Number rightNumber) {
                return leftNumber.doubleValue() < rightNumber.doubleValue();
            } else return false;
        }
    }
}
