package inequivalent;

public class ClonePair10264 {

    Integer method1(String string) {
        if (string != null && string.length() != 0) {
            return Integer.valueOf(string);
        }
        return null;
    }

    Integer method2(String aString) {
        if (aString == null || aString.trim().length() == 0) {
            return null;
        }
        return Integer.parseInt(aString);
    }
}
