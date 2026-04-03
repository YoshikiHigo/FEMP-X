package equivalent;

public class ClonePair1632 {
    Integer method1(Object obj) {
        if (obj == null) return null;
        if (obj instanceof Number) return Integer.valueOf(((Number) obj).intValue());
        if (obj instanceof Boolean) return (obj.equals(Boolean.FALSE)) ? Integer.valueOf(0) : Integer.valueOf(-1);
        try {
            return Integer.valueOf(obj.toString());
        } catch (Throwable t) {
        }
        return null;
    }

    Integer method2(Object obj) {
        if (obj == null) {
            return null;
        } else if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        } else if (obj instanceof Boolean) {
            return obj.equals(Boolean.FALSE) ? Integer.valueOf(0) : Integer.valueOf(-1);
        } else {
            try {
                return Integer.valueOf(obj.toString());
            } catch (final Throwable t) {
            }
        }
        return null;
    }
}
