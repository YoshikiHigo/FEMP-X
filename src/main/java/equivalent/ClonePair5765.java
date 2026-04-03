package equivalent;

public class ClonePair5765 {
    boolean method1(String str, boolean trim) {
        if (str == null || str.length() == 0) {
            return true;
        }
        if (!trim) return false;
        final int len = str.length();
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) > ' ') return false;
        }
        return true;
    }

    boolean method2(String str, boolean consider_trim) {
        if (str == null) return true;
        else if (str.length() == 0) return true;
        else return consider_trim && str.trim().length() == 0;
    }
}
