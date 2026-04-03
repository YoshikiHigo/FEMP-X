package equivalent;

public class ClonePair9269 {
    Short method1(Object value) {
        if (value == null) {
            return null;
        }
        if (value instanceof Short) {
            return (Short) value;
        }
        if (value instanceof Number) {
            return Short.valueOf(((Number) value).shortValue());
        }
        return Short.valueOf(value.toString());
    }

    Short method2(Object value) {
        if (value != null) {
            if (value instanceof Short) {
                return (Short) value;
            } else if (value instanceof Number) {
                return Short.valueOf(((Number) value).shortValue());
            } else {
                short shortValue = Short.parseShort(value.toString());
                return Short.valueOf(shortValue);
            }
        }
        return null;
    }
}
