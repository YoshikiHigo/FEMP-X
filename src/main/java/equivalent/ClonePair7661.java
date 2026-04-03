package equivalent;

public class ClonePair7661 {
    Byte method1(String value) {
        if (value != null) {
            try {
                return Byte.parseByte(value);
            } catch (NumberFormatException e) {
            }
        }
        return null;
    }

    Byte method2(String value) {
        if (value == null) {
            return null;
        }
        try {
            return Byte.valueOf(value);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
