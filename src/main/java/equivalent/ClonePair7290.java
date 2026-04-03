package equivalent;

public class ClonePair7290 {
    int method1(byte[] data, int offset) {
        int l = 0;
        for (int k = 0; k < 4; k++) {
            l = (l << 8) | (data[offset++] & 0xFF);
        }
        return l;
    }

    int method2(byte[] datagram, int pos) {
        int ttl = 0;
        for (int i = 0; i < 4; i++) {
            ttl = (ttl * 256) + (datagram[pos + i] & 0xff);
        }
        return ttl;
    }
}
