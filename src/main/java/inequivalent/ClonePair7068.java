package inequivalent;

public class ClonePair7068 {

    int method1(byte[] msg, int start) {
        if (msg.length <= start + 3) {
            return 0;
        }
        int r = 0;
        r |= 0x00FF & msg[start];
        r = r << 8;
        r |= 0x00FF & msg[start + 1];
        r = r << 8;
        r |= 0x00FF & msg[start + 2];
        r = r << 8;
        r |= 0x00FF & msg[start + 3];
        return r;
    }

    int method2(byte[] buffer, int offset) {
        if (offset <= buffer.length - 4) {
            return ((buffer[offset++] & 0xFF) << 24) + ((buffer[offset++] & 0xFF) << 16) + ((buffer[offset++] & 0xFF) << 8) + (buffer[offset++] & 0xFF);
        } else {
            int result = 0;
            for (int i = 0; i < 4; ++i) {
                result += offset < buffer.length ? (buffer[offset++] & 0xFF) : 0;
                result <<= 8;
            }
            return result;
        }
    }
}
