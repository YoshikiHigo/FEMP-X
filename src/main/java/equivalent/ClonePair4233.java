package equivalent;

public class ClonePair4233 {
    boolean method1(Object value, Object[] options) {
        boolean result = false;
        if (options != null && options.length > 0) {
            for (int i = 0; i < options.length; i++) {
                if (value == null) {
                    if (options[i] == null) {
                        result = true;
                        break;
                    }
                } else if (value.equals(options[i])) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    boolean method2(Object value, Object[] ignoredValue) {
        if (ignoredValue == null || ignoredValue.length == 0) {
            return false;
        }
        for (int i = 0; i < ignoredValue.length; i++) {
            if (ignoredValue[i] == null) {
                if (value == null) {
                    return true;
                }
            } else {
                if (ignoredValue[i].equals(value)) {
                    return true;
                }
            }
        }
        return false;
    }
}
