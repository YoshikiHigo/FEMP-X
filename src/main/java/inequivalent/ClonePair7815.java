package inequivalent;

import java.util.Arrays;

public class ClonePair7815 {

    boolean method1(Object a, Object b) {
        if (a == null) {
            return b == null;
        } else {
            return a.equals(b);
        }
    }

    boolean method2(Object value1, Object value2) {
        if (value1 == value2) return true;
        else if (value1 == null || value2 == null) return false;
        else if (value1.getClass() != value2.getClass()) return false;
        else if (value1 instanceof byte[]) return Arrays.equals((byte[]) value1, (byte[]) value2);
        else return value1.equals(value2);
    }
}
