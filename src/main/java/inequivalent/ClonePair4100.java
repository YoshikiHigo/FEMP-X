package inequivalent;

public class ClonePair4100 {

    boolean method1(String[] s1, String[] s2) {
        if (s1 == null && s2 == null) return true;
        if (s1 == null || s2 == null) return false;
        if (s1.length != s2.length) return false;
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] != s2[i]) return false;
        }
        return true;
    }

    boolean method2(String[] a, String[] b) {
        if (a == null || b == null) {
            return (a == null) == (b == null);
        }
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == null || b[i] == null) {
                if ((a[i] == null) ^ (b[i] == null)) {
                    return false;
                }
            } else if (!a[i].equals(b[i])) {
                return false;
            }
        }
        return true;
    }
}
