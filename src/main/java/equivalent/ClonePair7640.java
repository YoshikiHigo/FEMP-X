package equivalent;

public class ClonePair7640 {
    boolean method1(String oldValue, String newValue) {
        boolean result = false;
        if (oldValue == null && newValue == null) {
            result = false;
        } else if (oldValue == null && (newValue != null && newValue.length() == 0)) {
            result = false;
        } else if (oldValue == null && (newValue != null)) {
            result = true;
        } else if (oldValue != null && newValue == null) {
            result = true;
        } else if (!oldValue.equals(newValue)) {
            result = true;
        }
        return result;
    }

    boolean method2(String s1, String s2) {
        boolean result = false;
        if (s1 != null) {
            result = !s1.equals(s2);
        } else {
            result = s2 != null && !s2.equals("");
        }
        return result;
    }
}
