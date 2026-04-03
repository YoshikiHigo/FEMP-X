package equivalent;

public class ClonePair7937 {
    Long method1(Object value) {
        if (value != null) {
            if (value instanceof Long) {
                return (Long) value;
            } else if (value instanceof Number) {
                return Long.valueOf(((Number) value).longValue());
            } else {
                long longValue = Long.parseLong(value.toString());
                return Long.valueOf(longValue);
            }
        }
        return null;
    }

    Long method2(Object o) {
        if (o == null) return null;
        if (o instanceof Long) return (Long) o;
        if (o instanceof Number) return Long.valueOf(((Number) o).longValue());
        return Long.valueOf(o.toString());
    }
}
