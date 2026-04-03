package equivalent;

public class ClonePair8751 {
    int method1(Byte b1, Byte b2) {
        if (b1 == null) {
            return b2 == null ? 0 : -1;
        } else if (b2 == null) {
            return 1;
        }
        return b1.byteValue() < b2.byteValue() ? -1 : b1.byteValue() > b2.byteValue() ? 1 : 0;
    }

    int method2(Byte o1, Byte o2) {
        if (o1 == o2) return 0;
        if (o1 == null) return -1;
        if (o2 == null) return 1;
        if (o1.byteValue() < o2.byteValue()) return -1;
        if (o1.byteValue() > o2.byteValue()) return 1;
        return 0;
    }
}
