package inequivalent;

public class ClonePair8825 {

    byte[] method1(byte[] buf, int offset, int len) {
        byte[] translated = new byte[len];
        for (int j = 0; j < len; j++) {
            byte b = buf[offset + j];
            if (b == '/') translated[j] = (byte) '.';
            else translated[j] = b;
        }
        return translated;
    }

    byte[] method2(byte[] data, int offset, int len) {
        final byte[] buf = new byte[len];
        System.arraycopy(data, offset + 0, buf, 0, buf.length);
        return buf;
    }
}
