package equivalent;

public class ClonePair50 {
    Long method1(String string) {
        if (string == null) return null;
        try {
            return Long.valueOf(string);
        } catch (NumberFormatException exception) {
            return null;
        }
    }

    Long method2(String text) {
        if (text == null) {
            return null;
        }
        try {
            return (Long.parseLong(text));
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
