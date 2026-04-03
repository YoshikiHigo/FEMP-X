package equivalent;

public class ClonePair12612 {
    String method1(String s, char c) {
        if (s == null || s.length() == 0) return s;
        int spos = 0;
        while (true) {
            if (s.charAt(spos) == c) spos++;
            else break;
            if (spos >= s.length() - 1) break;
        }
        int epos = s.length() - 1;
        while (true) {
            if (s.charAt(epos) == c) epos--;
            else break;
            if (epos <= 0) break;
        }
        if (spos <= epos && (epos < s.length())) {
            return (s.substring(spos, epos + 1));
        }
        if (spos + 1 + epos == s.length()) return "";
        return s;
    }

    String method2(String str, char character) {
        if (str == null || str.length() == 0) {
            return str;
        }
        StringBuffer buf = new StringBuffer(str);
        while (buf.length() > 0 && buf.charAt(0) == character) {
            buf.deleteCharAt(0);
        }
        while (buf.length() > 0 && buf.charAt(buf.length() - 1) == character) {
            buf.deleteCharAt(buf.length() - 1);
        }
        return buf.toString();
    }
}
