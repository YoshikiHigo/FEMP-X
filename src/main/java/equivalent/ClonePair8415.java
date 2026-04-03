package equivalent;

public class ClonePair8415 {
    Boolean method1(Object obj) {
        if (obj == null) {
            return null;
        } else if (obj instanceof Boolean) {
            return (Boolean) obj;
        } else if (obj instanceof Number) {
            return ((Number) obj).intValue() == 0 ? Boolean.FALSE : Boolean.TRUE;
        } else if (obj instanceof String s) {
            if (s.equalsIgnoreCase("true")) {
                return Boolean.TRUE;
            } else if (s.equalsIgnoreCase("false")) {
                return Boolean.FALSE;
            } else {
                try {
                    return Boolean.valueOf(Integer.parseInt((String) obj) != 0);
                } catch (final Throwable t) {
                    return Boolean.FALSE;
                }
            }
        }
        return null;
    }

    Boolean method2(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        } else if (obj instanceof Number) {
            return ((Number) obj).intValue() == 0 ? Boolean.FALSE : Boolean.TRUE;
        } else if (obj instanceof String s) {
            if (s.equalsIgnoreCase("true")) {
                return Boolean.TRUE;
            } else if (s.equalsIgnoreCase("false")) {
                return Boolean.FALSE;
            } else {
                try {
                    return Boolean.valueOf(Integer.parseInt((String) obj) != 0);
                } catch (final Throwable t) {
                    return Boolean.FALSE;
                }
            }
        }
        return null;
    }
}
