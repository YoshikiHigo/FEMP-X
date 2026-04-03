package equivalent;

public class ClonePair9272 {
    Short method1(Object obj) {
        if (obj == null) return null;
        if (obj instanceof Number) return Short.valueOf(((Number) obj).shortValue());
        if (obj instanceof Boolean)
            return (obj.equals(Boolean.FALSE)) ? Short.valueOf((short) 0) : Short.valueOf((short) -1);
        try {
            return Short.valueOf(obj.toString());
        } catch (Throwable t) {
        }
        return null;
    }

    Short method2(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Short.valueOf(((Number) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return obj.equals(Boolean.FALSE) ? Short.valueOf((short) 0) : Short.valueOf((short) -1);
        }
        try {
            return Short.valueOf(obj.toString());
        } catch (final Throwable t) {
        }
        return null;
    }
}
