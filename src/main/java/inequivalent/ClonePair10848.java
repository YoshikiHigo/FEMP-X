package inequivalent;

public class ClonePair10848 {

    String method1(String string, int length, String padCharacter) {
        if (string == null) {
            return null;
        }
        if (padCharacter == null) {
            return null;
        }
        if (string.length() >= length) {
            return string.substring(0, length);
        }
        StringBuffer sb = new StringBuffer(string);
        while (sb.length() < length) {
            sb.append(padCharacter);
        }
        return sb.toString();
    }

    String method2(String string, int length, String padCharacter) {
        if (string == null) {
            return null;
        }
        if (padCharacter == null) {
            return null;
        }
        if (string.length() >= length) {
            return string.substring(0, length);
        }
        StringBuffer sb = new StringBuffer(string);
        while (sb.length() < length) {
            sb.insert(0, padCharacter);
        }
        return sb.toString();
    }
}
