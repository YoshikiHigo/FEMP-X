package inequivalent;

public class ClonePair10681 {

    int method1(String prop, int i) {
        String src = System.getProperty(prop);
        if (src != null) {
            i = Integer.parseInt(src);
        }
        return i;
    }

    int method2(String key, int defaultValue) {
        final String value = System.getProperty(key);
        if (null == value) {
            return defaultValue;
        }
        try {
            return Integer.parseInt(value);
        } catch (final NumberFormatException e) {
            return defaultValue;
        }
    }
}
