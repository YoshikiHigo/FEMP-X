package inequivalent;

public class ClonePair1640 {

    Integer method1(Object value) {
        if (value == null) {
            return null;
        }
        if (value instanceof Integer) {
            return (Integer) value;
        }
        if (value instanceof Number) {
            return Integer.valueOf(((Number) value).intValue());
        }
        return Integer.valueOf(value.toString());
    }

    Integer method2(Object value) {
        if (value != null) {
            return Integer.parseInt(String.valueOf(value));
        }
        return null;
    }
}
