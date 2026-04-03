package equivalent;

public class ClonePair10965 {
    boolean method1(Class c, Object o) {
        if (c.isInstance(o)) {
            return true;
        } else if (o == null) {
            return true;
        } else if (c.isPrimitive()) {
            return (c == Boolean.TYPE && o instanceof Boolean || c == Character.TYPE && o instanceof Character || c == Byte.TYPE && o instanceof Byte || c == Short.TYPE && o instanceof Short || c == Integer.TYPE && o instanceof Integer || c == Long.TYPE && o instanceof Long || c == Float.TYPE && o instanceof Float || c == Double.TYPE && o instanceof Double);
        }
        return false;
    }

    boolean method2(Class type, Object value) {
        if (value == null || type.isInstance(value)) {
            return true;
        } else if (type.isPrimitive()) {
            if (value instanceof Boolean && Boolean.TYPE.equals(type)) {
                return true;
            }
            if (value instanceof Byte && Byte.TYPE.equals(type)) {
                return true;
            }
            if (value instanceof Short && Short.TYPE.equals(type)) {
                return true;
            }
            if (value instanceof Integer && Integer.TYPE.equals(type)) {
                return true;
            }
            if (value instanceof Long && Long.TYPE.equals(type)) {
                return true;
            }
            if (value instanceof Float && Float.TYPE.equals(type)) {
                return true;
            }
            if (value instanceof Double && Double.TYPE.equals(type)) {
                return true;
            }
            return value instanceof Character && Character.TYPE.equals(type);
        } else {
            return false;
        }
    }
}
