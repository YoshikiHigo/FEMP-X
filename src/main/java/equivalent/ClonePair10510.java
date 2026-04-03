package equivalent;

public class ClonePair10510 {
    Integer method1(String value) {
        if (value == null) {
            return null;
        }
        try {
            return Integer.valueOf(value);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    Integer method2(String s) {
        if (s == null) return null;
        Integer rval = null;
        try {
            rval = Integer.valueOf(s);
        } catch (NumberFormatException e) {
            return null;
        }
        return rval;
    }
}
