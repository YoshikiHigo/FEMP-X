package equivalent;

public class ClonePair9011 {
    boolean method1(long key1, long key2) {
        if ((key1 < 0) == (key2 < 0)) {
            return key1 < key2;
        } else {
            return key2 < 0;
        }
    }

    boolean method2(long a, long b) {
        if ((b < 0L) && (a >= 0L)) return true;
        if ((b >= 0L) && (a < 0L)) return false;
        return a < b;
    }
}
