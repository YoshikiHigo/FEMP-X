package equivalent;

public class ClonePair9560 {
    boolean method1(char[] ch1, char[] ch2) {
        if (ch1 == null) {
            return ch2 == null;
        } else if (ch2 == null) {
            return false;
        }
        if (ch1.length != ch2.length) return false;
        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] != ch2[i]) return false;
        }
        return true;
    }

    boolean method2(char[] a1, char[] a2) {
        if (a1 == a2) return true;
        if (null == a1 || null == a2) return false;
        if (a1.length == a2.length) {
            int i = a1.length;
            while (--i >= 0) if (a1[i] != a2[i]) return false;
            return true;
        }
        return false;
    }
}
