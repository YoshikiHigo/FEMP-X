package equivalent;

public class ClonePair10845 {
    String method1(String s, int maxLength, String append) {
        if ((s == null) || (s.length() <= maxLength)) {
            return s;
        }
        return s.substring(0, maxLength - append.length()) + append;
    }

    String method2(String str, int limit, String appendage) {
        if (str == null || str.length() <= limit) {
            return str;
        }
        return str.substring(0, limit - appendage.length()) + appendage;
    }
}
