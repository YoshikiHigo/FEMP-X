package equivalent;

public class ClonePair8708 {
    String method1(String s, String pat) {
        if (!s.startsWith(pat)) {
            return null;
        }
        String ss = s.substring(pat.length() + 1).trim();
        return ss;
    }

    String method2(String s, String pat) {
        if (!s.startsWith(pat)) return null;
        s = s.substring(pat.length() + 1);
        return s.trim();
    }
}
