package inequivalent;

public class ClonePair13014 {

    long method1(String s) {
        if (s == null || s.isEmpty()) {
            return 0L;
        }
        try {
            return Long.parseLong(s, 16);
        } catch (Throwable t) {
            return 0L;
        }
    }

    long method2(String value) {
        try {
            if (value == null || value.length() == 0) {
                return 0;
            } else {
                if (value.charAt(0) == '+') {
                    value = value.substring(1);
                }
                return Long.parseLong(value);
            }
        } catch (Exception e) {
            return 0;
        }
    }
}
