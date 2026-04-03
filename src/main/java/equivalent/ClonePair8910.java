package equivalent;

public class ClonePair8910 {
    boolean method1(Object obj, boolean defaultValue) {
        if (obj == null) return defaultValue;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        } else if (obj instanceof Number) {
            return ((Number) obj).intValue() != 0;
        } else if (obj instanceof String s) {
            if (s.equalsIgnoreCase("true")) {
                return true;
            } else if (s.equalsIgnoreCase("false")) {
                return false;
            } else {
                try {
                    return Integer.parseInt((String) obj) != 0;
                } catch (Throwable t) {
                    return false;
                }
            }
        }
        return defaultValue;
    }

    boolean method2(Object obj, boolean defaultValue) {
        if (obj == null) {
            return defaultValue;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        } else if (obj instanceof Number) {
            return ((Number) obj).intValue() != 0;
        } else if (obj instanceof String s) {
            if (s.equalsIgnoreCase("true")) {
                return true;
            } else if (s.equalsIgnoreCase("false")) {
                return false;
            } else {
                try {
                    return Integer.parseInt((String) obj) != 0;
                } catch (Throwable t) {
                    return false;
                }
            }
        }
        return defaultValue;
    }
}
