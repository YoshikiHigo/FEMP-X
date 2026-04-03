package equivalent;

public class ClonePair12890 {
    Class method1(char type) {
        switch (type) {
            case 'B':
                return byte.class;
            case 'C':
                return char.class;
            case 'D':
                return double.class;
            case 'F':
                return float.class;
            case 'I':
                return int.class;
            case 'J':
                return long.class;
            case 'S':
                return short.class;
            case 'Z':
                return boolean.class;
            default:
                return null;
        }
    }

    Class method2(char c) {
        switch (c) {
            case 66:
                return Byte.TYPE;
            case 67:
                return Character.TYPE;
            case 68:
                return Double.TYPE;
            case 70:
                return Float.TYPE;
            case 73:
                return Integer.TYPE;
            case 74:
                return Long.TYPE;
            case 83:
                return Short.TYPE;
            case 90:
                return Boolean.TYPE;
        }
        return null;
    }
}
