package equivalent;

public class ClonePair2885 {
    boolean method1(byte[] baFirst, byte[] baSecond) {
        if (baFirst.length == baSecond.length) {
            for (int i = 0; i < baFirst.length; i++) {
                if (baFirst[i] != baSecond[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    boolean method2(byte[] a, byte[] b) {
        int size;
        if ((size = a.length) != b.length) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
