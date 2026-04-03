package inequivalent;

public class ClonePair5735 {

    boolean method1(String s, boolean b) {
        char[] c;
        int i, j, k;
        c = s.toCharArray();
        if (c.length != 2 && !b) return false;
        if (c.length != 4 && b) return false;
        for (i = 0, k = 0; i < c.length; i++) if (c[i] - '0' < 0 || c[i] - '0' > 9) return false;
        return true;
    }

    boolean method2(String str, boolean allowSign) {
        int i = 0;
        if (str.length() == 0) return false;
        if (str.charAt(0) == '+' || str.charAt(0) == '-') i = 1;
        for (; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') return false;
        }
        return true;
    }
}
