package equivalent;

public class ClonePair1445 {
    String method1(byte[] data) {
        StringBuilder buf = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            int low4Bits = data[i] & 0x0F;
            int high4Bits = (data[i] & 0xF0) >>> 4;
            buf.append(0 <= high4Bits && high4Bits <= 9 ? (char) ('0' + high4Bits) : (char) ('a' + (high4Bits - 10)));
            buf.append(0 <= low4Bits && low4Bits <= 9 ? (char) ('0' + low4Bits) : (char) ('a' + (low4Bits - 10)));
        }
        return buf.toString();
    }

    @SuppressWarnings("unused")
    String method2(byte[] digest) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < digest.length; ++i) {
            final byte b = digest[i];
            final int value = (b & 0x7F) + (b < 0 ? 128 : 0);
            buffer.append(value < 16 ? "0" : "");
            buffer.append(Integer.toHexString(value));
        }
        return buffer.toString();
    }
}
