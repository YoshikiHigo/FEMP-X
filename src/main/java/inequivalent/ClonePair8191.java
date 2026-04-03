package inequivalent;

public class ClonePair8191 {

    boolean method1(Object value) {
        if (value instanceof Number) {
            return ((Number) value).intValue() != 0;
        } else if (value instanceof String) {
            return Boolean.valueOf((String) value);
        } else {
            return Boolean.TRUE.equals(value);
        }
    }

    boolean method2(Object o) {
        if (o == null) {
            return false;
        } else if (o instanceof Boolean) {
            return ((Boolean) o).booleanValue();
        } else if (o instanceof Number) {
            return ((Number) o).doubleValue() != 0;
        } else {
            String val = o.toString().trim();
            try {
                return Double.parseDouble(val) != 0;
            } catch (NumberFormatException ex) {
            }
            if (val.equalsIgnoreCase("true")) {
                return true;
            } else if (val.equalsIgnoreCase("false")) {
                return false;
            }
            return false;
        }
    }
}
