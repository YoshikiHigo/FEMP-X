package inequivalent;

public class ClonePair10398 {

    boolean method1(CharSequence a, CharSequence b) {
        if (a == b) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        int len = a.length();
        if (len == b.length()) {
            for (int i = 0; i < len; i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    boolean method2(CharSequence a, CharSequence b) {
        if (a == b) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        int len = a.length();
        if (len == b.length()) {
            for (int i = 0; i < len; i++) {
                if (Character.toUpperCase(a.charAt(i)) != Character.toUpperCase(b.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
