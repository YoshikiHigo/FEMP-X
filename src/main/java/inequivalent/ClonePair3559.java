package inequivalent;

public class ClonePair3559 {

    Double method1(Object value) {
        if (value instanceof Number) return ((Number) value).doubleValue();
        else if (value instanceof String) {
            try {
                return Double.valueOf(((String) (value)).trim());
            } catch (NumberFormatException nfe) {
                return null;
            }
        }
        return null;
    }

    Double method2(Object input) {
        if (input == null) {
            return null;
        } else if (input instanceof Double) {
            return (Double) input;
        } else if (input instanceof Integer) {
            return ((Integer) input).doubleValue();
        } else if (input instanceof String) {
            return null;
        } else {
            return null;
        }
    }
}
