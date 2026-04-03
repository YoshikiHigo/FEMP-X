package equivalent;

public class ClonePair6115 {
    byte method1(byte[] bytes, int pos) {
        if (pos < bytes.length) {
            return bytes[pos];
        } else return 0;
    }

    byte method2(byte[] src, int i) {
        if (i > src.length - 1) return 0;
        return src[i];
    }
}
