package equivalent;

public class ClonePair6194 {
    boolean method1(boolean[] boolean1, boolean[] boolean2) {
        if (boolean1.length != boolean2.length) {
            return false;
        }
        for (int i = 0; i < boolean1.length; i++) {
            if (boolean1[i] != boolean2[i]) {
                return false;
            }
        }
        return true;
    }

    boolean method2(boolean[] ba, boolean[] ba2) {
        if (ba.length == 0 && ba2.length == 0) return true;
        if (ba.length != ba2.length) return false;
        int c = ba.length;
        for (int i = 0; i < c; i++) if (!(ba[i] == ba2[i])) return false;
        return true;
    }
}
