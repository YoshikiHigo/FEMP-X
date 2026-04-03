package inequivalent;

public class ClonePair8265 {

    int method1(byte[] bytes, int off, int end, char qq) {
        while (off < end) {
            byte b = bytes[off];
            if (b == qq) return off;
            off++;
        }
        return -1;
    }

    int method2(byte[] buf, int start, int end, char c) {
        byte b = (byte) c;
        int offset = start;
        while (offset < end) {
            if (buf[offset] == b) {
                return offset;
            }
            offset++;
        }
        return -1;
    }
}
