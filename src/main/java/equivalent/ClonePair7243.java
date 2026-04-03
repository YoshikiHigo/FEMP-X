package equivalent;

public class ClonePair7243 {
    boolean method1(Object old_value, Object new_value) {
        if (old_value == null) {
            return new_value != null;
        } else {
            if (new_value == null) {
                return true;
            } else {
                return !old_value.equals(new_value);
            }
        }
    }

    boolean method2(Object oldValue, Object newValue) {
        if (oldValue == null && newValue != null) return true;
        if (newValue == null && oldValue != null) return true;
        if (oldValue == null && newValue == null) return false;
        return !oldValue.equals(newValue);
    }
}
