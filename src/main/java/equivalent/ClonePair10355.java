package equivalent;

public class ClonePair10355 {
    Boolean method1(String aValue) {
        Boolean result = null;
        if (aValue != null) {
            if (aValue == "true" || aValue == "yes" || aValue.equalsIgnoreCase("true") || aValue.equalsIgnoreCase("yes")) {
                result = Boolean.TRUE;
            } else if (aValue == "false" || aValue == "no" || aValue.equalsIgnoreCase("false") || aValue.equalsIgnoreCase("no")) {
                result = Boolean.FALSE;
            }
        }
        return (result);
    }

    Boolean method2(String value) {
        if (value == null) {
            return null;
        } else if (value.equalsIgnoreCase("true") || value.equalsIgnoreCase("yes")) {
            return true;
        } else if (value.equalsIgnoreCase("false") || value.equalsIgnoreCase("no")) {
            return false;
        }
        return null;
    }
}
