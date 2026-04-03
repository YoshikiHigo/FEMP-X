package equivalent;

public class ClonePair1930 {
    Byte method1(Object obj) {
        if (obj == null) {
            return null;
        } else if (obj instanceof Number) {
            return Byte.valueOf(((Number) obj).byteValue());
        } else if (obj instanceof Boolean) {
            return obj.equals(Boolean.FALSE) ? Byte.valueOf((byte) 0) : Byte.valueOf((byte) -1);
        } else {
            try {
                return Byte.valueOf(obj.toString());
            } catch (final Throwable t) {
            }
        }
        return null;
    }

    Byte method2(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Byte.valueOf(((Number) obj).byteValue());
        }
        if (obj instanceof Boolean) {
            return obj.equals(Boolean.FALSE) ? Byte.valueOf((byte) 0) : Byte.valueOf((byte) -1);
        }
        try {
            return Byte.valueOf(obj.toString());
        } catch (final Throwable t) {
        }
        return null;
    }
}
