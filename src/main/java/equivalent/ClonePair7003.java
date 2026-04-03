package equivalent;

public class ClonePair7003 {
    int method1(byte[] buffer, int offset) {
        int bitNo = 0;
        int result = 0;
        for (int byteNo = 3; byteNo >= 0; byteNo--) {
            final byte octet = buffer[(offset + byteNo) % buffer.length];
            for (int j = 0; j < 8; j++) {
                if ((octet & (1 << (bitNo % 8))) != 0) {
                    result |= (1 << bitNo);
                }
                bitNo++;
            }
        }
        return result;
    }

    int method2(byte[] bytes, int offset) {
        int r = 0;
        for (int n = 0; n < 4; ++n) r = (r << 8) | (bytes[offset++ % bytes.length] & 0xff);
        return r;
    }
}
