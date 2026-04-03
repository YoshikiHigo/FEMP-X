package equivalent;

public class ClonePair8724 {
    int method1(String value, int defaultValue) {
        int parsed = defaultValue;
        if (value != null) {
            try {
                parsed = Integer.parseInt(value);
            } catch (NumberFormatException e) {
                parsed = defaultValue;
            }
        }
        return parsed;
    }

    int method2(String strData, int defaultValue) {
        int i = defaultValue;
        if (strData == null || strData.equals("")) {
            i = defaultValue;
        } else {
            try {
                i = Integer.parseInt(strData);
            } catch (NumberFormatException e) {
                return defaultValue;
            }
        }
        return i;
    }
}
