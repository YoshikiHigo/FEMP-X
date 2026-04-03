package inequivalent;

public class ClonePair10836 {

    int method1(String name, int defaultValue) {
        String val = System.getProperty(name);
        if (val != null) {
            try {
                return Integer.parseInt(val);
            } catch (NumberFormatException e) {
                return defaultValue;
            }
        } else {
            return defaultValue;
        }
    }

    int method2(String propertyName, int dflt) {
        String property = System.getProperty(propertyName);
        if (property == null || property.equals("")) return dflt;
        else return Integer.parseInt(property);
    }
}
