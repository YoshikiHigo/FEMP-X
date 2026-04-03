package equivalent;

public class ClonePair1662 {
    Integer method1(Object o) {
        if (o == null) return null;
        if (o instanceof Integer) return (Integer) o;
        if (o instanceof Number) return Integer.valueOf(((Number) o).intValue());
        return Integer.valueOf(o.toString());
    }

    Integer method2(Object value) {
        if (value != null) {
            if (value instanceof Integer) {
                return (Integer) value;
            } else if (value instanceof Number) {
                return ((Number) value).intValue();
            } else {
                int intValue = Integer.parseInt(value.toString());
                return intValue;
            }
        }
        return null;
    }
}
