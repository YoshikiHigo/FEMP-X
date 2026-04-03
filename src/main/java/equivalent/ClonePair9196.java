package equivalent;

public class ClonePair9196 {
    int method1(byte[] bytes, int start, byte value) {
        if (start > bytes.length) return -1;
        for (int i = start; i != bytes.length; i++) {
            if (bytes[i] == value) return i;
        }
        return -1;
    }

    int method2(byte[] buf, int begin, byte b) {
        for (int i = begin; i < buf.length; i++) {
            if (buf[i] == b) return i;
        }
        return -1;
    }
}
