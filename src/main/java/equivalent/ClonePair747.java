package equivalent;

public class ClonePair747 {
    long method1(String s, long def) {
        if (s == null || s.equals("")) {
            return def;
        }
        try {
            return Long.valueOf(s);
        } catch (NumberFormatException e) {
            return def;
        }
    }

    long method2(String parameterValue, long defaultValue) {
        long result = defaultValue;
        if (parameterValue != null) try {
            parameterValue.trim();
            if (parameterValue.length() < 1) return defaultValue;
            result = Long.parseLong(parameterValue);
        } catch (NumberFormatException nfEx) {
        }
        return result;
    }
}
