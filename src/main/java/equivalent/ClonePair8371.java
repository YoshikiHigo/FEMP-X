package equivalent;

public class ClonePair8371 {
    boolean method1(String v1, String v2) {
        if (v1 == null && v2 == null) return false;
        if (v1 == null || v2 == null) return true;
        return !v1.equals(v2);
    }

    boolean method2(String oldValue, String newValue) {
        boolean changed = false;
        if (oldValue == null) {
            if (newValue != null) {
                changed = true;
            }
        } else if (newValue == null) {
            changed = true;
        } else if (!oldValue.equals(newValue)) {
            changed = true;
        }
        return changed;
    }
}
