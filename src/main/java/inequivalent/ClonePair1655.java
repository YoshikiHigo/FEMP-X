package inequivalent;

public class ClonePair1655 {

    Integer method1(Object value) {
        if (value instanceof Integer) {
            return (Integer) value;
        } else if (value instanceof String) {
            try {
                return Integer.parseInt((String) value);
            } catch (NumberFormatException e) {
                return null;
            }
        } else {
            return null;
        }
    }

    Integer method2(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            if (obj instanceof Number) {
                return Integer.valueOf(((Number) obj).intValue());
            }
            if (obj instanceof Boolean) {
                return obj.equals(Boolean.FALSE) ? Integer.valueOf(0) : Integer.valueOf(-1);
            }
            return Integer.valueOf(obj.toString().trim());
        } catch (final Throwable t) {
            try {
                return Integer.valueOf(obj.toString().trim());
            } catch (final Throwable ta) {
            }
        }
        return null;
    }
}
