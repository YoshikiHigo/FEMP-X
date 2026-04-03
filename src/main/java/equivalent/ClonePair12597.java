package equivalent;

public class ClonePair12597 {
    boolean method1(int read, int prevRead, int dt) {
        if (dt > 0 && read < 0 && prevRead > 0) return true;
        return dt < 0 && read > 0 && prevRead < 0;
    }

    boolean method2(int read, int prevRead, int dt) {
        if (dt > 0 && read < 0 && prevRead > 0) {
            return true;
        }
        return dt < 0 && read > 0 && prevRead < 0;
    }
}
