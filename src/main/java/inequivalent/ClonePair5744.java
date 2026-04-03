package inequivalent;

public class ClonePair5744 {

    boolean method1(String parameter, boolean defaultValue) {
        if (parameter == null) {
            return defaultValue;
        } else if (parameter.equalsIgnoreCase("true") || parameter.equalsIgnoreCase("t") || parameter.equalsIgnoreCase("1")) {
            return true;
        } else if (parameter.equalsIgnoreCase("false") || parameter.equalsIgnoreCase("f") || parameter.equalsIgnoreCase("0")) {
            return false;
        } else {
            return defaultValue;
        }
    }

    boolean method2(String attributeValue, boolean def) {
        if (attributeValue == null) return def;
        if ("0".equals(attributeValue) || "false".equals(attributeValue)) return false;
        if ("1".equals(attributeValue) || "true".equals(attributeValue)) return true;
        System.out.println("*** Error while parsing boolean attribute value '" + def + "'");
        return def;
    }
}
