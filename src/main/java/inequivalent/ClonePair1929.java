package inequivalent;

public class ClonePair1929 {

    Byte method1(Object value) {
        if (value == null) {
            return null;
        }
        if (value instanceof Byte) {
            return (Byte) value;
        }
        return Byte.valueOf(value.toString());
    }

    Byte method2(Object value) {
        if (value != null) {
            if (value instanceof Byte) {
                return (Byte) value;
            } else if (value instanceof Number) {
                return Byte.valueOf(((Number) value).byteValue());
            } else {
                byte byteValue = Byte.parseByte(value.toString());
                return Byte.valueOf(byteValue);
            }
        }
        return null;
    }
}
