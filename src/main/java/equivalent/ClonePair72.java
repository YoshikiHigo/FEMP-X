package equivalent;

public class ClonePair72 {
    Boolean method1(String value, Boolean defaultValue) {
        if (value == null) return (defaultValue);
        else if (value.equalsIgnoreCase("yes") || value.equalsIgnoreCase("true") || value.equalsIgnoreCase("on"))
            return (Boolean.TRUE);
        else if (value.equalsIgnoreCase("no") || value.equalsIgnoreCase("false") || value.equalsIgnoreCase("off"))
            return (Boolean.FALSE);
        else return (defaultValue);
    }

    Boolean method2(String value, Boolean defaultValue) {
        if (value == null) return defaultValue;
        if (value.equalsIgnoreCase("yes") || value.equalsIgnoreCase("true") || value.equalsIgnoreCase("on"))
            return Boolean.TRUE;
        if (value.equalsIgnoreCase("no") || value.equalsIgnoreCase("false") || value.equalsIgnoreCase("off"))
            return Boolean.FALSE;
        else return defaultValue;
    }
}
