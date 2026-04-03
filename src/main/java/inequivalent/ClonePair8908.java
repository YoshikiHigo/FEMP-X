package inequivalent;

public class ClonePair8908 {

    boolean method1(Object obj, boolean defaultValue) {
        if (obj == null) return defaultValue;
        if (obj instanceof Boolean) return ((Boolean) obj).booleanValue();
        if (obj instanceof Integer) return ((Integer) obj).intValue() != 0;
        if (obj instanceof String) {
            String str = ((String) obj).trim().toLowerCase();
            if ("true".equals(str) || "yes".equals(str)) return true;
            if ("false".equals(str) || "no".equals(str)) return false;
        }
        try {
            return Integer.parseInt(obj.toString()) != 0;
        } catch (NumberFormatException ignore_me) {
        }
        return defaultValue;
    }

    boolean method2(Object obj, boolean defaultValue) {
        if (obj == null) return defaultValue;
        if (obj instanceof Boolean) return ((Boolean) obj).booleanValue();
        if (obj instanceof Number) return ((Number) obj).intValue() != 0;
        if (obj instanceof String) {
            String str = ((String) obj).trim();
            if ("true".equalsIgnoreCase(str) || "yes".equalsIgnoreCase(str)) return true;
            if ("false".equalsIgnoreCase(str) || "no".equalsIgnoreCase(str)) return false;
        }
        try {
            return Integer.parseInt(obj.toString()) != 0;
        } catch (NumberFormatException ignore_me) {
        }
        return defaultValue;
    }
}
