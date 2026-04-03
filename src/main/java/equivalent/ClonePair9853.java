package equivalent;

public class ClonePair9853 {
    boolean method1(char[] a, char[] b) {
        int l_a = a.length;
        int l_b = b.length;
        if (l_a != l_b) {
            return false;
        }
        for (int i = 0; i < l_a; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    boolean method2(char[] ch1, char[] ch2) {
        if (ch1.length != ch2.length) return false;
        for (int i = 0; i < ch2.length; i++) {
            if (ch1[i] != ch2[i]) {
                return false;
            }
        }
        return true;
    }
}
