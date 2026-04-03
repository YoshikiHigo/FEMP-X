package equivalent;

public class ClonePair12916 {
    long method1(String paramName) {
        if (paramName == null || "".equals(paramName)) {
            return 0L;
        } else {
            return Long.parseLong(paramName);
        }
    }

    long method2(String value) {
        if (value == null || value.length() == 0) {
            return 0;
        }
        return Long.parseLong(value);
    }
}
