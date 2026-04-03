package equivalent;

public class ClonePair12684 {
    Class method1(String name) {
        if (name.equals("int")) {
            return Integer.TYPE;
        } else if (name.equals("char")) {
            return Character.TYPE;
        } else if (name.equals("byte")) {
            return Byte.TYPE;
        } else if (name.equals("double")) {
            return Double.TYPE;
        } else if (name.equals("float")) {
            return Float.TYPE;
        } else if (name.equals("long")) {
            return Long.TYPE;
        } else if (name.equals("short")) {
            return Short.TYPE;
        } else if (name.equals("boolean")) {
            return Boolean.TYPE;
        } else {
            return null;
        }
    }

    Class method2(String type) {
        if (type.equals("boolean")) {
            return Boolean.TYPE;
        } else if (type.equals("byte")) {
            return Byte.TYPE;
        } else if (type.equals("char")) {
            return Character.TYPE;
        } else if (type.equals("short")) {
            return Short.TYPE;
        } else if (type.equals("int")) {
            return Integer.TYPE;
        } else if (type.equals("long")) {
            return Long.TYPE;
        } else if (type.equals("float")) {
            return Float.TYPE;
        } else if (type.equals("double")) {
            return Double.TYPE;
        }
        return null;
    }
}
