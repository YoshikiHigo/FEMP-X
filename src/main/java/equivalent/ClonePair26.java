package equivalent;

public class ClonePair26 {
    Long method1(String text) {
        if (text == null) {
            return null;
        }
        Long number = null;
        try {
            number = Long.valueOf(text);
        } catch (NumberFormatException e) {
        }
        return number;
    }

    Long method2(String str) {
        if (str == null || "".equals(str.trim())) {
            return null;
        }
        if (str.endsWith(".0")) {
            str = str.substring(0, str.indexOf(".0"));
        }
        Long longObject = null;
        try {
            longObject = Long.valueOf(str);
        } catch (Exception e) {
        }
        return longObject;
    }
}
