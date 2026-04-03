package equivalent;

public class ClonePair10316 {
    String method1(byte[] data, int off, int len) {
        int offset = off;
        StringBuffer buf = new StringBuffer();
        for (int end = offset + len; offset < end; ) {
            int ch = data[offset++] & 0xFF;
            switch (ch >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    break;
                case 12:
                case 13:
                    if (offset >= len) {
                        return null;
                    }
                    ch = ((ch & 0x1F) << 6) | (data[offset++] & 0x3F);
                    break;
                case 14:
                    if (offset + 2 >= len) {
                        return null;
                    }
                    ch = ((ch & 0x0f) << 12) | ((data[offset++] & 0x3F) << 6) | (data[offset++] & 0x3F);
                    break;
                default:
                    if (offset + 1 >= len) {
                        return null;
                    }
                    ch = ((ch & 0x3F) << 4) | (data[offset++] & 0x0f);
                    break;
            }
            buf.append((char) ch);
        }
        return buf.toString();
    }

    String method2(byte[] data, int off, int len) {
        StringBuffer buf = new StringBuffer();
        for (int end = off + len; off < end; ) {
            int ch = data[off++] & 0xFF;
            switch (ch >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    break;
                case 12:
                case 13:
                    if (off >= len) {
                        return null;
                    }
                    ch = ((ch & 0x1F) << 6) | (data[off++] & 0x3F);
                    break;
                case 14:
                    if (off + 2 >= len) {
                        return null;
                    }
                    ch = ((ch & 0x0f) << 12) | ((data[off++] & 0x3F) << 6) | (data[off++] & 0x3F);
                    break;
                default:
                    if (off + 1 >= len) {
                        return null;
                    }
                    ch = ((ch & 0x3F) << 4) | (data[off++] & 0x0f);
                    break;
            }
            buf.append((char) ch);
        }
        return buf.toString();
    }
}
