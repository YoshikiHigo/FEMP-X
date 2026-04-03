package inequivalent;

public class ClonePair11157 {

    boolean method1(Class formal, Class actual) {
        if (actual == null && !formal.isPrimitive()) {
            return true;
        }
        if (actual != null && formal.isAssignableFrom(actual)) {
            return true;
        }
        if (formal.isPrimitive()) {
            if (formal == Boolean.TYPE && actual == Boolean.class) {
                return true;
            }
            if (formal == Character.TYPE && actual == Character.class) {
                return true;
            }
            if (formal == Byte.TYPE && actual == Byte.class) {
                return true;
            }
            if (formal == Short.TYPE && (actual == Short.class || actual == Byte.class)) {
                return true;
            }
            if (formal == Integer.TYPE && (actual == Integer.class || actual == Short.class || actual == Byte.class)) {
                return true;
            }
            if (formal == Long.TYPE && (actual == Long.class || actual == Integer.class || actual == Short.class || actual == Byte.class)) {
                return true;
            }
            if (formal == Float.TYPE && (actual == Float.class || actual == Long.class || actual == Integer.class || actual == Short.class || actual == Byte.class)) {
                return true;
            }
            return formal == Double.TYPE && (actual == Double.class || actual == Float.class || actual == Long.class || actual == Integer.class || actual == Short.class || actual == Byte.class);
        }
        return false;
    }

    boolean method2(Class paramType, Class argType) {
        if (argType == null) return !paramType.isPrimitive();
        if (paramType == argType || paramType.isAssignableFrom(argType)) return true;
        if (paramType == int.class) return argType == Integer.class;
        else if (paramType == float.class) return argType == Float.class;
        else if (paramType == double.class) return argType == Double.class;
        else if (paramType == long.class) return argType == Long.class;
        else if (paramType == char.class) return argType == Character.class;
        else if (paramType == short.class) return argType == Short.class;
        else if (paramType == byte.class) return argType == Byte.class;
        else if (paramType == boolean.class) return argType == Boolean.class;
        return false;
    }
}
