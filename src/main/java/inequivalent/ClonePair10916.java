package inequivalent;

public class ClonePair10916 {

    String method1(String s, String value) {
        if (s != null && s.startsWith(value)) {
            s = s.substring(value.length());
        }
        if (s != null && s.endsWith(value)) {
            s = s.substring(0, s.length() - value.length());
        }
        return s;
    }

    String method2(String str, String trimStr) {
        if (str == null || str.length() == 0) return str;
        for (str = str.trim(); str.startsWith(trimStr); str = str.substring(trimStr.length()).trim()) ;
        for (; str.endsWith(trimStr); str = str.substring(0, str.length() - trimStr.length()).trim()) ;
        return str;
    }
}
