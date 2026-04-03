package equivalent;

public class ClonePair42 {
    Long method1(String s) {
        if (s == null) return null;
        Long rval = null;
        try {
            rval = Long.valueOf(s);
        } catch (NumberFormatException e) {
            return null;
        }
        return rval;
    }

    Long method2(String value) {
        if (value != null) {
            try {
                return Long.parseLong(value);
            } catch (NumberFormatException e) {
            }
        }
        return null;
    }
}
